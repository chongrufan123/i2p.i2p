/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.util;
public class messages_et extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[62];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-11-24 13:40+0000\nLast-Translator: zzzi2p\nLanguage-Team: Estonian (Estonia) (http://www.transifex.com/otf/I2P/language/et_EE/)\nLanguage: et_EE\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Rejecting tunnels: Connection limit";
    t[3] = "Keeldun tunnelitest: \u00dchenduste arvu piirang";
    t[4] = "Rejecting tunnels: Bandwidth limit";
    t[5] = "Keeldun tunnelitest: Ribalaiuse piirang";
    t[6] = "Accepting tunnels";
    t[7] = "N\u00f5ustun tunnelitega";
    t[10] = "Dropping tunnel requests: Overloaded";
    t[11] = "Eiran tunneliosaluse palveid: \u00dclekoormus";
    t[12] = "Dropping tunnel requests: High load";
    t[13] = "Eiran tunneliosaluse palveid: K\u00f5rge koormus";
    t[14] = "Rejecting tunnels";
    t[15] = "Keeldun tunnelitest";
    t[16] = "Rejecting tunnels: Shutting down";
    t[17] = "Keeldun tunnelitest: V\u00e4lja l\u00fclitumine";
    t[20] = "Rejecting most tunnels: High number of requests";
    t[21] = "Keeldun enamusest tunnelitest: Palju p\u00e4ringuid";
    t[22] = "Rejecting tunnels: Hidden mode";
    t[23] = "Tunnelite tagasil\u00fckkamine: Varjatud re\u017eiimis";
    t[24] = "Rejecting tunnels: High message delay";
    t[25] = "Keeldun tunnelitest: K\u00f5rge s\u00f5numite viive";
    t[26] = "OK";
    t[27] = "OK";
    t[30] = "Rejecting most tunnels: Bandwidth limit";
    t[31] = "Keeldun enamusest tunnelitest: Ribalaiuse piirang";
    t[34] = "Accepting most tunnels";
    t[35] = "N\u00f5ustun enamuse tunnelitega";
    t[38] = "Firewalled";
    t[39] = "Tulem\u00fc\u00fcri taga";
    t[44] = "Rejecting tunnels: Limit reached";
    t[45] = "Keeldun tunnelitest: Piirang \u00fcletatud";
    t[48] = "Rejecting tunnels: Starting up";
    t[49] = "Keeldun tunnelitest: Alles k\u00e4ivitun";
    t[54] = "Rejecting tunnels: Request overload";
    t[55] = "Keeldun tunnelitest: Osaluspalvete \u00fclekoormus";
    t[56] = "Dropping tunnel requests: Queue time";
    t[57] = "Eiran tunneliosaluse palveid: Pikk j\u00e4rjekord";
    t[58] = "Testing";
    t[59] = "Testin";
    t[60] = "Dropping tunnel requests: Too slow";
    t[61] = "Eiran tunneliosaluse palveid: Liiga aeglane";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 31) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 29) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 62)
        idx -= 62;
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
        { while (idx < 62 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 62);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 62 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
