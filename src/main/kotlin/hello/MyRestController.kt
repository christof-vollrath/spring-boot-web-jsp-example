package hello

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class MyRestController {

    @RequestMapping("/rest")
    fun article(): String {
        val article = Article(text = "Kotlin builder html from article", keywords = "Some keywords and some more")
        return PageCreator().createPage(article).toString()
    }
}
