package browser.history.browser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class BrowserHistoryTest {
    lateinit var browserHistory: BrowserHistory

    @BeforeEach
    internal fun setUp() {
        browserHistory = BrowserHistory("leetcode.com")
    }

    @Test
    internal fun visitCorrectWork() {
        val expected = "google.com"
        browserHistory.visit(expected)

        val node : NodeBrowser = browserHistory.getCurrentPage()

        assertEquals(expected, node.value)
    }
}