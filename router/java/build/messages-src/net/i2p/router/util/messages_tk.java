/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.util;
public class messages_tk extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[166];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P routerconsole\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-19 14:09+0000\nLast-Translator: Alperen Yavuz <mingyu@yaani.com>, 2020\nLanguage-Team: Turkmen (https://www.transifex.com/otf/teams/12694/tk/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: tk\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Dropping tunnel requests: High load";
    t[3] = "Tunel ha\u00fdy\u015flaryny ta\u015flamak: loadokary \u00fd\u00fck";
    t[4] = "Firewalled";
    t[5] = "Gorag diwary";
    t[10] = "IPv4: OK; IPv6: Firewalled";
    t[11] = "IPv4: bol\u00fdar; IPv6: Goragly";
    t[12] = "Rejecting tunnels: Hidden mode";
    t[13] = "Tunelleri ret etmek: Gizlin re .im";
    t[14] = "IPv4: Symmetric NAT; IPv6: OK";
    t[15] = "IPv4: Simmetrik NAT; IPv6: Bol\u00fdar";
    t[20] = "Dropping tunnel requests: Overloaded";
    t[21] = "Tunel ha\u00fdy\u015flaryny ta\u015flamak: Artykma\u00e7";
    t[24] = "Rejecting tunnels";
    t[25] = "Tunelleri retmak: \u00d6\u00e7enbe";
    t[30] = "IPv4: Testing; IPv6: Firewalled";
    t[31] = "IPv4: Synag; IPv6: Goragly";
    t[38] = "Testing";
    t[39] = "Synag";
    t[44] = "Rejecting tunnels: Bandwidth limit";
    t[45] = "Rejecting tunnels: Bandwidth limit";
    t[54] = "Rejecting tunnels: Shutting down";
    t[55] = "Tunelleri ret etmek: \u00d6\u00e7\u00fcrmek";
    t[58] = "IPv4: Testing; IPv6: OK";
    t[59] = "IPv4: Synag; IPv6: Bol\u00fdar";
    t[62] = "Rejecting tunnels: Request overload";
    t[63] = "Tunelleri ret etmek: Artykma\u00e7 \u00fd\u00fck talap edi\u0148";
    t[68] = "OK";
    t[69] = "Haz\u0131r";
    t[70] = "Rejecting tunnels: Limit reached";
    t[71] = "Tunelleri ret etmek: \u00c7\u00e4klendirildi";
    t[74] = "IPv4: Firewalled; IPv6: OK";
    t[75] = "IPv4: Goragly; IPv6: Bol\u00fdar";
    t[78] = "IPv4: Disabled; IPv6: Firewalled";
    t[79] = "IPv4: Ma\u00fdyp; IPv6: Goragly";
    t[84] = "Accepting tunnels";
    t[85] = "Tunelleri kabul etmek";
    t[88] = "IPv4: Disabled; IPv6: OK";
    t[89] = "IPv4: Ma\u00fdyp; IPv6: Bol\u00fdar";
    t[92] = "Accepting most tunnels";
    t[93] = "Tunelleri\u0148 k\u00f6p\u00fcsini kabul etmek";
    t[94] = "Symmetric NAT";
    t[95] = "Simmetrik NAT";
    t[96] = "Rejecting most tunnels: Bandwidth limit";
    t[97] = "Tunelleri\u0148 k\u00f6p\u00fcsini ret etmek: Zolak gi\u0148ligi";
    t[98] = "Dropping tunnel requests: Queue time";
    t[99] = "Tunel ha\u00fdy\u015flaryny ta\u015flamak: nobaty\u0148 wagty";
    t[100] = "Dropping tunnel requests: High job lag";
    t[101] = "Tunel isleglerini ta\u015flamak: jobokary i\u015f yza galmak";
    t[102] = "Dropping tunnel requests: Too slow";
    t[103] = "Tunel ha\u00fdy\u015flaryny ta\u015flamak: Gaty ha\u00fdal";
    t[104] = "Disconnected";
    t[105] = "\u00d6\u00e7\u00fcrildi";
    t[106] = "Rejecting most tunnels: High number of requests";
    t[107] = "Tunelleri\u0148 k\u00f6p\u00fcsini ret etmek: Islegleri\u0148 k\u00f6p bolmagy";
    t[124] = "Port Conflict";
    t[125] = "Port dawasy";
    t[130] = "Rejecting tunnels: Starting up";
    t[131] = "Tunelleri ret etmek: Ba\u015flamak";
    t[132] = "Rejecting tunnels: High message delay";
    t[133] = "Tunelleri ret etmek: messageokary habar gijikdirilmegi";
    t[138] = "IPv4: Symmetric NAT; IPv6: Testing";
    t[139] = "IPv4: Simmetrik NAT; IPv6: Synag";
    t[142] = "IPv4: Disabled; IPv6: Testing";
    t[143] = "IPv4: Ma\u00fdyp; IPv6: Synag";
    t[152] = "IPv4: OK; IPv6: Testing";
    t[153] = "IPv4: bol\u00fdar; IPv6: Synag";
    t[158] = "Rejecting tunnels: Connection limit";
    t[159] = "Tunelleri ret etmek: Baglany\u015f \u00e7\u00e4gi";
    t[164] = "IPv4: Firewalled; IPv6: Testing";
    t[165] = "IPv4: Goragly; IPv6: Synag";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 83) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 81) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 166)
        idx -= 166;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 166 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 166);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 166 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
