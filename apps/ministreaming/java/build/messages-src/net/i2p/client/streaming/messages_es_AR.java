/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.client.streaming;
public class messages_es_AR extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[86];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2014-06-24 22:17+0000\nLanguage-Team: Spanish (Argentina) (http://www.transifex.com/otf/I2P/language/es_AR/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: es_AR\nPlural-Forms: nplurals=3; plural=n == 1 ? 0 : n != 0 && n % 1000000 == 0 ? 1 : 2;\n";
    t[2] = "Message expired";
    t[3] = "El mensaje expir\u00f3";
    t[6] = "Invalid destination";
    t[7] = "Destino I2P no v\u00e1lido";
    t[10] = "Local lease set invalid";
    t[11] = "El lease set (t\u00faneles al mismo destino) local no es v\u00e1lido";
    t[12] = "Connection was reset";
    t[13] = "La conexi\u00f3n fue reiniciada";
    t[22] = "Local network failure";
    t[23] = "Fallo de la red local";
    t[30] = "No local tunnels";
    t[31] = "No hay t\u00faneles locales";
    t[36] = "Failed delivery to local destination";
    t[37] = "Fallo en la entrega al destino local";
    t[38] = "Unsupported encryption options";
    t[39] = "Opciones de cifrado no soportadas";
    t[40] = "Local router failure";
    t[41] = "Fallo del router local";
    t[44] = "Failure code";
    t[45] = "C\u00f3digo de fallo";
    t[50] = "Invalid message";
    t[51] = "Mensaje no v\u00e1lido";
    t[56] = "Message timeout";
    t[57] = "Tiempo hasta la expiraci\u00f3n del mensaje";
    t[58] = "Session closed";
    t[59] = "Sesi\u00f3n cerrada";
    t[60] = "Local destination shutdown";
    t[61] = "Cierre del destino local";
    t[64] = "Destination lease set expired";
    t[65] = "El lease set (t\u00faneles al mismo destino) del destino expir\u00f3";
    t[68] = "Buffer overflow";
    t[69] = "Desbordamiento de memoria intermedia (buffer)";
    t[72] = "Destination lease set not found";
    t[73] = "No se encontr\u00f3 el LeaseSet (t\u00faneles) del destino";
    t[82] = "Invalid message options";
    t[83] = "Opciones de mensaje no v\u00e1lido";
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
