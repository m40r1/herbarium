package main

import (
	"log"
	"math/rand"
	"strings"
	"time"

	"github.com/gocolly/colly"
)

func main() {

	c := colly.NewCollector(
		colly.AllowedDomains("criasaude.com.br", "www.criasaude.com.br"),
		colly.UserAgent(randomUserAgent(userAgents)),
		colly.MaxDepth(2),
		colly.Async(true),
	)

	c.Limit(&colly.LimitRule{DomainGlob: "*", Parallelism: 2})

	c.OnHTML("div.resp-tabs-container > div > ul > li", func(e *colly.HTMLElement) {
		links := e.ChildAttrs("a", "href")

		//REVIEW refazer isso de uma forma mais performatica
		for _, link := range links {

			var planta = Planta{}

			//paragrafo nome

			c.OnHTML("div.dekokt-prod-detail:nth-child(3) > p:nth-child(2)", func(h *colly.HTMLElement) {
				//Cada nome e um set de dois slices
				// REVIEW this is bad

				nomes := strings.Split(h.Text, ":")
				ts := strings.Split(nomes[1], "Nome binomial")

				planta.NomePopular = strings.Join(ts, "")

				log.Printf("link: %s & planta: %s", link, planta.NomePopular)
			})

			c.Visit(e.Request.AbsoluteURL(link))
		}
		//FIXME refazer
		//
		//this is all the links
		// idk why
		// c.Visit(e.Request.AbsoluteURL(links[0]))
	})

	c.Visit("https://www.criasaude.com.br/N222/todas-as-plantas-medicinais.html#horizontalTab1")

	c.Wait()
}

func randomUserAgent(userAgents []string) string {
	//TODO refazer a cada n pedidos
	rand.Seed(time.Hour.Nanoseconds())
	ua := rand.Int() % len(userAgents)
	return userAgents[ua]
}

var userAgents []string = []string{
	"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.246",
	"Mozilla/5.0 (X11; CrOS x86_64 8172.45.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.64 Safari/537.36",
	"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.111 Safari/537.36",
	"Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:15.0) Gecko/20100101 Firefox/15.0.1",
}

type Planta struct {
	NomeCientifico    string
	NomePopular       string
	EfeirosMedicinais string
	Indicacoes        string
	ContraIndicacoes  string
}
