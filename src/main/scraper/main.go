package main

import "github.com/gocolly/colly"

func main() {
	c := colly.NewCollector(
		colly.AllowedDomains("www.criasaude.com.br", "criasaude.com.br"),
		colly.AllowURLRevisit(),
		colly.MaxDepth(2),
		colly.Async(true),
	)

	//XXX achar links das plantas
	// c.OnHTML(goquerySelector string, f colly.HTMLCallback)

}
