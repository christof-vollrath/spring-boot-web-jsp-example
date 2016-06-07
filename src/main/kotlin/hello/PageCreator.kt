package hello

class PageCreator {
    fun createPage(article: Article): Html {
        return html("de") {
            metaTags(this, article)
            text(article.text)
        }
    }

    fun metaTags(html: Html, article: Article) {
        val metas = mapOf("viewport" to "width=device-width, initial-scale=1",
                "keywords" to article.keywords,
                "description" to "Aktuelle Nachrichten aus den Bereichen News, Leute, Sport, Auto und mehr",
                "news_keywords" to "Bild-Channel Home",
                "robots" to "noindex, follow, noarchive")
        html.apply {
            for((k,v) in metas) meta(name = k, content = v)
        }
    }
}