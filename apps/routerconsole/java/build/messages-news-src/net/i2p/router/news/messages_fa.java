/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.news;
public class messages_fa extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[14];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-07-01 23:39+0000\nLast-Translator: magnifico\nLanguage-Team: Persian (http://www.transifex.com/otf/I2P/language/fa/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: fa\nPlural-Forms: nplurals=2; plural=(n > 1);\n";
    t[2] = "Welcome to I2P!";
    t[3] = "\u0628\u0647 I2P \u062e\u0648\u0634 \u0622\u0645\u062f\u06cc\u062f!";
    t[6] = "Congratulations on getting I2P installed!";
    t[7] = "\u062a\u0628\u0631\u06cc\u06a9 \u0628\u0627\u0628\u062a \u0646\u0635\u0628 I2P!";
    t[8] = "Do not use SOCKS for this.";
    t[9] = "\u0627\u0632 \u0633\u0627\u06a9\u0633 \u0628\u0631\u0627\u06cc \u0627\u06cc\u0646 \u0627\u0633\u062a\u0641\u0627\u062f\u0647 \u0646\u06a9\u0646.";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 7) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 14 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 14);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 14 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}