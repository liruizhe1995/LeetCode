class Solution {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i-1) == '(') {
                    if (i >= 2) {
                        dp[i] = 2 + dp[i-2];
                    } else {
                        dp[i] = 2;
                    }
                } else if (i - dp[i-1] > 0 && s.charAt(i - dp[i-1] - 1) == '(') {
                    if (i - dp[i-1] >= 2) {
                        dp[i] = 2 + dp[i-1] + dp[i - dp[i-1] - 2];
                    } else {
                        dp[i] = 2 + dp[i-1];
                    }
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }
}

/*
If s[i] is '(', set longest[i] to 0, because any string end with '(' cannot be a valid one.

Else if s[i] is ')'

     If s[i-1] is '(', longest[i] = longest[i-2] + 2

     Else if s[i-1] is ')' and s[i-longest[i-1]-1] == '(', longest[i] = longest[i-1] + 2 + longest[i-longest[i-1]-2]

*/
