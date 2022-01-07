package browser.history.browser

class BrowserHistory(startPage: String) {
    val head: NodeBrowser = NodeBrowser(startPage)
    var tail: NodeBrowser? = null

    fun visit(url: String) {
        // [head] -> [url]
        val node = NodeBrowser(url)
        head.next = node
    }

    fun back(): String {
        return ""
    }

    fun forward(steps: Int): String {
        return ""
    }

    fun getCurrentPage(): NodeBrowser {
        var current: NodeBrowser = head

        while (current.next != null) {
            current = current.next!!
        }

        return current
    }
}