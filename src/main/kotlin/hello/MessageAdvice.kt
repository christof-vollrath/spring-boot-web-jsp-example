package hello

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ModelAttribute

@ControllerAdvice
class MessageAdvice {

    @ModelAttribute("message")
    fun message(@Value("\${application.message:Hello World}") message: String): String {
        return message
    }

}
