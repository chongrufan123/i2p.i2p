/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.desktopgui;
public class messages_de extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[102];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2011-02-13 12:05+0000\nLast-Translator: Georg Stadler, 2022\nLanguage-Team: German (http://www.transifex.com/otf/I2P/language/de/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: de\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[4] = "Shutdown imminent";
    t[5] = "Herunterfahren bevorstehend";
    t[6] = "Shutdown in {0}";
    t[7] = "Herunterfahren in {0}";
    t[10] = "Network";
    t[11] = "Netzwerk";
    t[16] = "Enable notifications";
    t[17] = "Benachrichtigungen aktivieren";
    t[18] = "Configure I2P System Tray";
    t[19] = "I2P System Tray konfigurieren";
    t[22] = "Stop I2P";
    t[23] = "I2P beenden";
    t[24] = "I2P: Right-click for menu";
    t[25] = "I2P: Rechtsklick f\u00fcr Men\u00fc";
    t[28] = "Restart I2P Immediately";
    t[29] = "I2P sofort neustarten";
    t[30] = "Stop I2P Immediately";
    t[31] = "I2P sofort beenden";
    t[50] = "Restart I2P";
    t[51] = "I2P neustarten";
    t[54] = "Starting";
    t[55] = "Startend";
    t[70] = "Cancel I2P Shutdown";
    t[71] = "Herunterfahren von I2P abbrechen";
    t[74] = "Disable notifications";
    t[75] = "Benachrichtigungen deaktivieren";
    t[86] = "I2P is starting!";
    t[87] = "I2P startet gerade!";
    t[88] = "Start I2P";
    t[89] = "I2P starten";
    t[100] = "Launch I2P Browser";
    t[101] = "I2P-Browser \u00f6ffnen";
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
