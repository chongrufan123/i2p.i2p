/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.desktopgui;
public class messages_vi extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[36];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2017-06-30 21:32+0000\nLast-Translator: zzzi2p\nLanguage-Team: Vietnamese (http://www.transifex.com/otf/I2P/language/vi/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: vi\nPlural-Forms: nplurals=1; plural=0;\n";
    t[4] = "Launch I2P Browser";
    t[5] = "K\u00edch ho\u1ea1t tr\u00ecnh duy\u1ec7t I2P";
    t[8] = "I2P is starting!";
    t[9] = "I2P \u0111ang b\u1eaft \u0111\u1ea7u";
    t[12] = "Starting";
    t[13] = "B\u1eaft \u0111\u1ea7u";
    t[20] = "Disable";
    t[21] = "T\u1eaft";
    t[22] = "Stop I2P";
    t[23] = "Ng\u01b0ng I2P";
    t[28] = "Network";
    t[29] = "M\u1ea1ng l\u01b0\u1edbi";
    t[32] = "Restart I2P";
    t[33] = "Kh\u1edfi \u0111\u1ed9ng l\u1ea1i I2P";
    t[34] = "Start I2P";
    t[35] = "Kh\u1edfi \u0111\u1ed9ng I2P";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 18) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 36 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 36);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 36 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
