/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.desktopgui;
public class messages_zh_TW extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[102];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2011-02-13 12:05+0000\nLast-Translator: \u9ec3\u5f65\u5112 <r1235613@gmail.com>, 2017\nLanguage-Team: Chinese (Taiwan) (http://www.transifex.com/otf/I2P/language/zh_TW/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: zh_TW\nPlural-Forms: nplurals=1; plural=0;\n";
    t[4] = "Shutdown imminent";
    t[5] = "\u5f37\u5236\u95dc\u9589";
    t[6] = "Shutdown in {0}";
    t[7] = "\u95dc\u9589\u65bc {0}";
    t[10] = "Network";
    t[11] = "\u7db2\u8def";
    t[16] = "Enable notifications";
    t[17] = "\u542f\u7528\u901a\u77e5";
    t[18] = "Configure I2P System Tray";
    t[19] = "\u8a2d\u5b9aI2P\u7cfb\u7d71\u6587\u4ef6\u593e";
    t[22] = "Stop I2P";
    t[23] = "\u505c\u6b62I2P";
    t[24] = "I2P: Right-click for menu";
    t[25] = "I2P\uff1a\u53f3\u9375\u958b\u555f\u9078\u55ae";
    t[28] = "Restart I2P Immediately";
    t[29] = "\u5f37\u5236\u91cd\u555fI2P";
    t[30] = "Stop I2P Immediately";
    t[31] = "\u5f37\u5236\u7d42\u6b62I2P";
    t[50] = "Restart I2P";
    t[51] = "\u91cd\u555fI2P";
    t[54] = "Starting";
    t[55] = "\u555f\u52d5\u4e2d";
    t[64] = "Disable system tray";
    t[65] = "\u7981\u7528\u7cfb\u7edf\u6258\u76d8";
    t[70] = "Cancel I2P Shutdown";
    t[71] = "\u53d6\u6d88\u505c\u6b62I2P";
    t[74] = "Disable notifications";
    t[75] = "\u7981\u7528\u901a\u77e5";
    t[86] = "I2P is starting!";
    t[87] = "I2P\u5df2\u555f\u52d5";
    t[88] = "Start I2P";
    t[89] = "\u555f\u52d5I2P";
    t[100] = "Launch I2P Browser";
    t[101] = "\u958b\u555fI2P\u700f\u89bd\u5668";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 51) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 102 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 102);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 102 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
