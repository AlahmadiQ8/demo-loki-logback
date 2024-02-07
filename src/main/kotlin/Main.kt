import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*

val properties = Properties()

val logger: Logger = LoggerFactory.getLogger("Demo")

class Demo

fun main(args: Array<String>) {
    properties.load(Demo::class.java.getResourceAsStream("/application.properties"))

    logger.info("OMG OMG OMG")
    logger.info("NOOOO")
    repeat(1000) {
        Thread.sleep(500)
        logger.info("OMG OMG $it")
    }
}