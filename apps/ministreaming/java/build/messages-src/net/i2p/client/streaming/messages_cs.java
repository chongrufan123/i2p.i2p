/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.client.streaming;
public class messages_cs extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[86];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2021-07-08 12:50+0000\nLast-Translator: slrslr\nLanguage-Team: Czech (http://www.transifex.com/otf/I2P/language/cs/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: cs\nPlural-Forms: nplurals=4; plural=(n == 1 && n % 1 == 0) ? 0 : (n >= 2 && n <= 4 && n % 1 == 0) ? 1: (n % 1 != 0 ) ? 2 : 3;\n";
    t[2] = "Message expired";
    t[3] = "Zpr\u00e1va vypr\u0161ela";
    t[6] = "Invalid destination";
    t[7] = "Neplatn\u00fd c\u00edl";
    t[10] = "Local lease set invalid";
    t[11] = "Nastaven\u00ed m\u00edstn\u00edho pron\u00e1jmu je neplatn\u00e9";
    t[12] = "Connection was reset";
    t[13] = "Spojen\u00ed bylo resetov\u00e1no";
    t[22] = "Local network failure";
    t[23] = "Chyba lok\u00e1ln\u00ed s\u00edt\u011b";
    t[30] = "No local tunnels";
    t[31] = "\u017d\u00e1dn\u00e9 m\u00edstn\u00ed tunely";
    t[36] = "Failed delivery to local destination";
    t[37] = "Dod\u00e1n\u00ed k m\u00edstn\u00edmu c\u00edli se nezda\u0159ilo";
    t[38] = "Unsupported encryption options";
    t[39] = "Nepodporovan\u00e9 vlastnosti \u0161ifrov\u00e1n\u00ed";
    t[40] = "Local router failure";
    t[41] = "Chyba lok\u00e1ln\u00edho routeru";
    t[44] = "Failure code";
    t[45] = "K\u00f3d selh\u00e1n\u00ed";
    t[50] = "Invalid message";
    t[51] = "Neplatn\u00e1 zpr\u00e1va";
    t[56] = "Message timeout";
    t[57] = "P\u0159est\u00e1vka do dal\u0161\u00ed zpr\u00e1vy";
    t[58] = "Session closed";
    t[59] = "Sch\u016fze uzav\u0159ena";
    t[60] = "Local destination shutdown";
    t[61] = "Vypnut\u00ed m\u00edstn\u00edho c\u00edle";
    t[64] = "Destination lease set expired";
    t[65] = "Vypr\u0161ela platnost sady c\u00edlov\u00e9ho pron\u00e1jmu";
    t[68] = "Buffer overflow";
    t[69] = "P\u0159ete\u010den\u00ed vyrovn\u00e1vac\u00ed pam\u011bti";
    t[72] = "Destination lease set not found";
    t[73] = "C\u00edlov\u00e1 sada pron\u00e1jmu nebyla nalezena";
    t[82] = "Invalid message options";
    t[83] = "Neplatn\u00e9 vlastnosti zpr\u00e1vy";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 43) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 41) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 86)
        idx -= 86;
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
        { while (idx < 86 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 86);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 86 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
