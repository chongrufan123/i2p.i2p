/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.desktopgui;
public class messages_uk extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[66];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2017-06-30 21:32+0000\nLast-Translator: Maxym Mykhalchuk\nLanguage-Team: Ukrainian (Ukraine) (http://www.transifex.com/otf/I2P/language/uk_UA/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: uk_UA\nPlural-Forms: nplurals=3; plural=(n%10==1 && n%100!=11 ? 0 : n%10>=2 && n%10<=4 && (n%100<10 || n%100>=20) ? 1 : 2);\n";
    t[10] = "Launch I2P Browser";
    t[11] = "\u0417\u0430\u043f\u0443\u0441\u0442\u0438\u0442\u0438 I2P \u0411\u0440\u0430\u0443\u0437\u0435\u0440";
    t[12] = "Shutdown in {0}";
    t[13] = "\u0417\u0443\u043f\u0438\u043d\u043a\u0430 \u0437\u0430 {0}";
    t[16] = "Shutdown imminent";
    t[17] = "\u0417\u0443\u043f\u0438\u043d\u043a\u0430 \u043d\u0435\u043c\u0438\u043d\u0443\u0447\u0430";
    t[22] = "Restart I2P Immediately";
    t[23] = "\u041d\u0435\u0433\u0430\u0439\u043d\u043e \u043f\u0435\u0440\u0435\u0437\u0430\u043f\u0443\u0441\u0442\u0438\u0442\u0438 I2P";
    t[26] = "Restart I2P";
    t[27] = "\u041f\u0435\u0440\u0435\u0437\u0430\u043f\u0443\u0441\u0442\u0438\u0442\u0438 I2P";
    t[30] = "Configure I2P System Tray";
    t[31] = "\u041d\u0430\u043b\u0430\u0448\u0442\u0443\u0432\u0430\u0442\u0438 \u0441\u0438\u0441\u0442\u0435\u043c\u043d\u0438\u0439 \u0442\u0440\u0435\u0439 I2P";
    t[34] = "Network";
    t[35] = "\u041c\u0435\u0440\u0435\u0436\u0430";
    t[36] = "Stop I2P Immediately";
    t[37] = "\u041d\u0435\u0433\u0430\u0439\u043d\u043e \u0437\u0443\u043f\u0438\u043d\u0438\u0442\u0438 I2P";
    t[52] = "Stop I2P";
    t[53] = "\u0417\u0443\u043f\u0438\u043d\u0438\u0442\u0438 I2P";
    t[54] = "I2P: Right-click for menu";
    t[55] = "I2P: \u041a\u043b\u0430\u0446\u043d\u0456\u0442\u044c \u043f\u0440\u0430\u0432\u043e\u044e \u043a\u043d\u043e\u043f\u043a\u043e\u044e \u043c\u0438\u0448\u0456 \u0449\u043e\u0431 \u0432\u0456\u0434\u043a\u0440\u0438\u0442\u0438 \u043c\u0435\u043d\u044e";
    t[56] = "I2P is starting!";
    t[57] = "I2P \u0437\u0430\u043f\u0443\u0441\u043a\u0430\u0454\u0442\u044c\u0441\u044f!";
    t[58] = "Start I2P";
    t[59] = "\u0417\u0430\u043f\u0443\u0441\u0442\u0438\u0442\u0438 I2P";
    t[60] = "Starting";
    t[61] = "\u0417\u0430\u043f\u0443\u0441\u043a\u0430\u0454\u0442\u044c\u0441\u044f";
    t[62] = "Disable";
    t[63] = "\u0412\u0438\u043c\u043a\u043d\u0443\u0442\u0438";
    t[64] = "Cancel I2P Shutdown";
    t[65] = "\u0421\u043a\u0430\u0441\u0443\u0432\u0430\u0442\u0438 \u0437\u0443\u043f\u0438\u043d\u043a\u0443 I2P";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 33) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 66 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 66);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 66 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}