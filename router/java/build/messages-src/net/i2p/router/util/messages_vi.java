/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.util;
public class messages_vi extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[70];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-11-24 13:40+0000\nLast-Translator: zzzi2p\nLanguage-Team: Vietnamese (http://www.transifex.com/otf/I2P/language/vi/)\nLanguage: vi\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nPlural-Forms: nplurals=1; plural=0;\n";
    t[2] = "Rejecting most tunnels: High number of requests";
    t[3] = "T\u1eeb ch\u1ed1i h\u1ea7u h\u1ebft \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: S\u1ed1 l\u01b0\u1ee3ng y\u00eau c\u1ea7u cao";
    t[6] = "Dropping tunnel requests: Too slow";
    t[7] = "B\u1ecf y\u00eau c\u1ea7u \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: Qu\u00e1 ch\u1eadm";
    t[8] = "OK";
    t[9] = "OK";
    t[12] = "Rejecting tunnels: Shutting down";
    t[13] = "T\u1eeb ch\u1ed1i \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: \u0110ang t\u1eaft";
    t[14] = "Rejecting tunnels: Starting up";
    t[15] = "T\u1eeb ch\u1ed1i \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: \u0110ang kh\u1edfi \u0111\u1ed9ng";
    t[16] = "Rejecting most tunnels: Bandwidth limit";
    t[17] = "T\u1eeb ch\u1ed1i h\u1ea7u h\u1ebft \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: Gi\u1edbi h\u1ea1n b\u0103ng th\u00f4ng";
    t[20] = "Disconnected";
    t[21] = "\u0110\u00e3 d\u1eebng k\u1ebft n\u1ed1i";
    t[24] = "Rejecting tunnels: High message delay";
    t[25] = "T\u1eeb ch\u1ed1i \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: \u0110\u1ed9 tr\u1ec5 tin nh\u1eafn cao";
    t[26] = "Dropping tunnel requests: Queue time";
    t[27] = "B\u1ecf y\u00eau c\u1ea7u \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: H\u00e0ng \u0111\u1ee3i th\u1eddi gian";
    t[28] = "Rejecting tunnels: Limit reached";
    t[29] = "T\u1eeb ch\u1ed1i \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: \u0110\u1ea1t t\u1edbi h\u1ea1n";
    t[36] = "Rejecting tunnels: Connection limit";
    t[37] = "T\u1eeb ch\u1ed1i \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: v\u01b0\u1ee3t gi\u1edbi h\u1ea1n k\u1ebft n\u1ed1i";
    t[38] = "Rejecting tunnels";
    t[39] = "Ch\u1ea5p nh\u1eadn \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang";
    t[40] = "Dropping tunnel requests: Overloaded";
    t[41] = "B\u1ecf y\u00eau c\u1ea7u \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: Qu\u00e1 t\u1ea3i";
    t[46] = "Rejecting tunnels: Request overload";
    t[47] = "T\u1eeb ch\u1ed1i \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: Qu\u00e1 t\u1ea3i y\u00eau c\u1ea7u k\u1ebft n\u1ed1i";
    t[52] = "Rejecting tunnels: Bandwidth limit";
    t[53] = "T\u1eeb ch\u1ed1i \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: Gi\u1edbi h\u1ea1n b\u0103ng th\u00f4ng";
    t[58] = "Dropping tunnel requests: High load";
    t[59] = "B\u1ecf y\u00eau c\u1ea7u \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang: \u0110\u1ed9 t\u1ea3i qu\u00e1 cao";
    t[62] = "Accepting tunnels";
    t[63] = "Ch\u1ea5p nh\u1eadn \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang";
    t[68] = "Accepting most tunnels";
    t[69] = "Ch\u1ea5p nh\u1eadn h\u1ea7u h\u1ebft \u0111\u01b0\u1eddng \u1ed1ng ri\u00eang";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 35) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 33) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 70)
        idx -= 70;
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
        { while (idx < 70 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 70);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 70 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}