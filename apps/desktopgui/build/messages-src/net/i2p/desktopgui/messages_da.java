/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.desktopgui;
public class messages_da extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[34];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2017-06-30 21:32+0000\nLast-Translator: zzzi2p\nLanguage-Team: Danish (http://www.transifex.com/otf/I2P/language/da/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: da\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[4] = "Shutdown imminent";
    t[5] = "Lukker ned om et \u00f8jeblik";
    t[6] = "Shutdown in {0}";
    t[7] = "Lukker ned om {0}";
    t[10] = "Network";
    t[11] = "Netv\u00e6rk";
    t[14] = "Disable";
    t[15] = "Deaktivere";
    t[16] = "Restart I2P";
    t[17] = "Genstart I2P";
    t[18] = "I2P is starting!";
    t[19] = "I2P starter!";
    t[20] = "Start I2P";
    t[21] = "Start I2P";
    t[22] = "Stop I2P";
    t[23] = "Stop I2P";
    t[28] = "Starting";
    t[29] = "Starter";
    t[32] = "Launch I2P Browser";
    t[33] = "Start I2P Browseren";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 17) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 15) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 34)
        idx -= 34;
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
        { while (idx < 34 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 34);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 34 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
