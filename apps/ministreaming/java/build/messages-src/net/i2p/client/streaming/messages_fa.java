/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.client.streaming;
public class messages_fa extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[26];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-06-29 10:15+0000\nLast-Translator: magnifico\nLanguage-Team: Persian (http://www.transifex.com/otf/I2P/language/fa/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: fa\nPlural-Forms: nplurals=2; plural=(n > 1);\n";
    t[6] = "Session closed";
    t[7] = "\u0646\u0634\u0633\u062a \u0628\u0633\u062a\u0647 \u0634\u062f";
    t[8] = "Invalid message";
    t[9] = "\u067e\u06cc\u0627\u0645 \u0646\u0627\u0645\u0639\u062a\u0628\u0631";
    t[10] = "Message timeout";
    t[11] = "\u0627\u062a\u0645\u0627\u0645 \u0648\u0642\u062a \u067e\u06cc\u0627\u0645";
    t[12] = "Message expired";
    t[13] = "\u067e\u06cc\u0627\u0645 \u0627\u0646\u0642\u0636\u0627 \u06cc\u0627\u0641\u062a";
    t[16] = "Invalid destination";
    t[17] = "\u0645\u0642\u0635\u062f \u0646\u0627\u0645\u0639\u062a\u0628\u0631";
    t[18] = "Buffer overflow";
    t[19] = "\u0633\u0631\u0631\u06cc\u0632 \u0628\u0627\u0641\u0631";
    t[20] = "Invalid message options";
    t[21] = "\u06af\u0632\u06cc\u0646\u0647 \u0647\u0627\u06cc \u067e\u06cc\u0627\u0645 \u0646\u0627\u0645\u0639\u062a\u0628\u0631";
    t[22] = "No local tunnels";
    t[23] = "\u0647\u06cc\u0686 \u062a\u0648\u0646\u0644 \u0645\u062d\u0644\u06cc";
    t[24] = "Unsupported encryption options";
    t[25] = "\u06af\u0632\u06cc\u0646\u0647 \u0647\u0627\u06cc \u0631\u0645\u0632\u06af\u0630\u0627\u0631\u06cc \u067e\u0634\u062a\u06cc\u0628\u0627\u0646\u06cc \u0646\u0634\u062f\u0647";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 13) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 26 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 26);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 26 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
