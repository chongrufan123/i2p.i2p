/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.util;
public class messages_ja extends java.util.ResourceBundle {
  private static final java.lang.Object[] table;
  static {
    java.lang.Object[] t = new java.lang.Object[46];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P routerconsole\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-17 17:16+0000\nLast-Translator: \u30bf\u30ab\u30cf\u30b7, 2022\nLanguage-Team: Japanese (https://www.transifex.com/otf/teams/12694/ja/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: ja\nPlural-Forms: nplurals=1; plural=0;\n";
    t[4] = "{0} hour";
    t[5] = new java.lang.String[] { "{0} \u6642\u9593" };
    t[8] = "{0} similar message omitted";
    t[9] = new java.lang.String[] { "{0} \u4ef6\u306e\u985e\u4f3c\u30e1\u30c3\u30bb\u30fc\u30b8\u3092\u7701\u7565\u3002" };
    t[10] = "DEBUG";
    t[11] = "\u30c7\u30d0\u30c3\u30b0";
    t[12] = "{0} sec";
    t[13] = new java.lang.String[] { "{0} \u79d2" };
    t[14] = "{0} day";
    t[15] = new java.lang.String[] { "{0} \u65e5" };
    t[16] = "{0,number,####} ms";
    t[17] = new java.lang.String[] { "{0,number,####} \u30df\u30ea\u79d2" };
    t[18] = "CRIT";
    t[19] = "\u81f4\u547d\u7684";
    t[20] = "{0} min";
    t[21] = new java.lang.String[] { "{0} \u5206" };
    t[22] = "WARN";
    t[23] = "\u8b66\u544a";
    t[28] = "ERROR";
    t[29] = "\u30a8\u30e9\u30fc";
    t[30] = "n/a";
    t[31] = "n/a";
    t[32] = "{0,number,####} ns";
    t[33] = new java.lang.String[] { "{0,number,###} \u30ca\u30ce\u79d2" };
    t[34] = "{0} year";
    t[35] = new java.lang.String[] { "{0} \u5e74" };
    t[40] = "INFO";
    t[41] = "\u60c5\u5831";
    t[44] = "{0,number,####} \u03bcs";
    t[45] = new java.lang.String[] { "{0,number,###} \u30de\u30a4\u30af\u30ed\u79d2" };
    table = t;
  }
  public static final java.lang.String[] get_msgid_plural_table () {
    return new java.lang.String[] { "{0} hours", "{0} similar messages omitted", "{0} sec", "{0} days", "{0,number,####} ms", "{0} min", "{0,number,###} ns", "{0} years", "{0,number,###} \u03bcs" };
  }
  public java.lang.Object lookup (java.lang.String msgid) {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 23) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 21) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 46)
        idx -= 46;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    java.lang.Object value = lookup(msgid);
    return (value instanceof java.lang.String[] ? ((java.lang.String[])value)[0] : value);
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 46 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 46);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 46 && table[idx] == null);
          return key;
        }
      };
  }
  public static long pluralEval (long n) {
    return 0;
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}