class BrowserHistory {
    ArrayList<String> arr = new ArrayList<>();
    int curr = 0;

    public BrowserHistory(String homepage) {
        arr.add(homepage);
    }

    public void visit(String url) {
        while (arr.size() > curr + 1) {
            arr.remove(arr.size() - 1);
        }
        arr.add(url);
        curr++;
    }

    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return arr.get(curr);
    }

    public String forward(int steps) {
        curr = Math.min(arr.size() - 1, curr + steps);
        return arr.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */