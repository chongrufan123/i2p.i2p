/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.client.streaming;
public class messages_it extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[58];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2017-06-30 21:32+0000\nLast-Translator: Sebastiano Pistore <SebastianoPistore.info@protonmail.ch>\nLanguage-Team: Italian (http://www.transifex.com/otf/I2P/language/it/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: it\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[4] = "Invalid message options";
    t[5] = "Opzioni del messaggio non valide";
    t[6] = "Invalid destination";
    t[7] = "Destinazione non valida";
    t[10] = "Message timeout";
    t[11] = "Timeout del messaggio";
    t[12] = "Failed delivery to local destination";
    t[13] = "Spedizione fallita alla destinazione locale";
    t[16] = "Invalid message";
    t[17] = "Messaggio non valido";
    t[26] = "Session closed";
    t[27] = "Sessione chiusa";
    t[30] = "Local router failure";
    t[31] = "Errore del router locale";
    t[36] = "Message expired";
    t[37] = "Messaggio scaduto";
    t[38] = "Local network failure";
    t[39] = "Errore della rete locale";
    t[40] = "No local tunnels";
    t[41] = "Nessun tunnel locale";
    t[44] = "Failure code";
    t[45] = "Codice d'errore";
    t[46] = "Buffer overflow";
    t[47] = "Errore di buffer overflow";
    t[50] = "Unsupported encryption options";
    t[51] = "Opzioni di cifratura non supportate";
    t[56] = "Connection was reset";
    t[57] = "La connessione \u00e8 stata resettata";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 29) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 27) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 58)
        idx -= 58;
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
        { while (idx < 58 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 58);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 58 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
