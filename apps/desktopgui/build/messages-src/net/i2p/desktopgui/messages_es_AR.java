/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.desktopgui;
public class messages_es_AR extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[102];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2011-02-13 12:05+0000\nLast-Translator: kaze kaze <kaze@rlab.be>, 2017\nLanguage-Team: Spanish (Argentina) (http://www.transifex.com/otf/I2P/language/es_AR/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: es_AR\nPlural-Forms: nplurals=3; plural=n == 1 ? 0 : n != 0 && n % 1000000 == 0 ? 1 : 2;\n";
    t[4] = "Shutdown imminent";
    t[5] = "Apagado inminente";
    t[6] = "Shutdown in {0}";
    t[7] = "Apagar en {0}";
    t[10] = "Network";
    t[11] = "Red";
    t[16] = "Enable notifications";
    t[17] = "Activar las notificaciones";
    t[18] = "Configure I2P System Tray";
    t[19] = "Configurar la Bandeja de Sistema de I2P";
    t[22] = "Stop I2P";
    t[23] = "Detener I2P";
    t[24] = "I2P: Right-click for menu";
    t[25] = "I2P Clic derecho para el men\u00fa";
    t[28] = "Restart I2P Immediately";
    t[29] = " Reiniciar I2P inmediatamente ";
    t[30] = "Stop I2P Immediately";
    t[31] = " Detener I2P inmediatamente ";
    t[50] = "Restart I2P";
    t[51] = "Riniciar I2P";
    t[54] = "Starting";
    t[55] = "Iniciando";
    t[64] = "Disable system tray";
    t[65] = "Desactivar la bandeja del sistema";
    t[70] = "Cancel I2P Shutdown";
    t[71] = "Cancelar el Apagado de I2P";
    t[74] = "Disable notifications";
    t[75] = "Desactivar las notificaciones";
    t[86] = "I2P is starting!";
    t[87] = "I2P esta iniciando!";
    t[88] = "Start I2P";
    t[89] = "Iniciando I2P...";
    t[100] = "Launch I2P Browser";
    t[101] = "Lanzar el Navegador I2P";
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
