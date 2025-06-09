class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String withoutHypen = s.replaceAll(\-\, \\);
        int n = withoutHypen.length();
        int rem = n % k;
        String res = \\;
        if (rem > 0) {
            res += withoutHypen.substring(0, rem) + \-\;
        }
        for (int i = rem; i + k <= n; i += k) {
            res += withoutHypen.substring(i, i + k) + \-\;
        }
        return res.toUpperCase().substring(0, res.length() != 0 ? res.length() - 1 : res.length());

    }
}