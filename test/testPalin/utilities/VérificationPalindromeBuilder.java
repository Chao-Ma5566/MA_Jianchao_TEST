package testPalin.utilities;

import testPalin.LangueInterface;
import testPalin.VérificationPalindrome;

public class VérificationPalindromeBuilder {
    private LangueInterface langue;

    public VérificationPalindromeBuilder PourLangue(LangueInterface langue){
        this.langue = langue;
        return this;
    }

    public VérificationPalindrome Build() {
        return new VérificationPalindrome(this.langue);
    }
}
