/* Automatically generated by GNU msgfmt.  Do not modify!  */
package org.klomp.snark.web;
public class messages_da extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[290];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2011-02-13 12:00+0000\nLast-Translator: duck <duck@mail.i2p>\nLanguage-Team: Danish (http://www.transifex.com/otf/I2P/language/da/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: da\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Start";
    t[3] = "Start";
    t[4] = "Never";
    t[5] = "Aldrig";
    t[12] = "Skip";
    t[13] = "Spring over";
    t[18] = "Private";
    t[19] = "Privat";
    t[24] = "Stop";
    t[25] = "Stop";
    t[26] = "Comments";
    t[27] = "Kommentarer";
    t[34] = "Configuration";
    t[35] = "Konfiguration";
    t[40] = "RX";
    t[41] = "RX";
    t[42] = "Completed";
    t[43] = "Fuldf\u00f8rt";
    t[44] = "Delete selected";
    t[45] = "Slet valgte";
    t[62] = "Comment";
    t[63] = "Comment";
    t[66] = "Starting";
    t[67] = "Starter";
    t[68] = "Updating from {0}";
    t[69] = "Opdaterer fra {0}";
    t[74] = "Save Changes";
    t[75] = "Gem \u00e6ndringer";
    t[76] = "Add";
    t[77] = "Tilf\u00f8je";
    t[92] = "Standard";
    t[93] = "Standard";
    t[100] = "Next";
    t[101] = "N\u00e6ste";
    t[102] = "Resource";
    t[103] = "Ressource";
    t[108] = "Last activity";
    t[109] = "Sidste aktivitet";
    t[110] = "Name";
    t[111] = "Navn";
    t[112] = "light";
    t[113] = "lyst";
    t[118] = "OK";
    t[119] = "OK";
    t[122] = "Status";
    t[123] = "Status";
    t[130] = "First";
    t[131] = "F\u00f8rste";
    t[132] = "Size";
    t[133] = "St\u00f8rrelse";
    t[146] = "dark";
    t[147] = "m\u00f8rk";
    t[148] = "Created";
    t[149] = "Oprettet";
    t[152] = "Torrents";
    t[153] = "Torrents";
    t[158] = "Unknown";
    t[159] = "Ukendt";
    t[162] = "Preview";
    t[163] = "Forh\u00e5ndsvisning";
    t[164] = "TX";
    t[165] = "TX";
    t[166] = "Mark for deletion";
    t[167] = "Marker for sletning";
    t[174] = "Open";
    t[175] = "\u00c5bn";
    t[190] = "Skipped";
    t[191] = "Skippet";
    t[196] = "Primary";
    t[197] = "Prim\u00e6re";
    t[198] = "Router is down";
    t[199] = "Routeren k\u00f8rer ikke";
    t[200] = "Updating";
    t[201] = "Opdatere";
    t[202] = "Remaining";
    t[203] = "Tilbage";
    t[206] = "ETA";
    t[207] = "ETA";
    t[210] = "minutes";
    t[211] = "minutter";
    t[212] = "Added";
    t[213] = "Tilf\u00f8jet";
    t[220] = "High";
    t[221] = "H\u00f8j";
    t[226] = "I2PSnark";
    t[227] = "I2PSnark";
    t[228] = "Remove";
    t[229] = "Fjern";
    t[230] = "Delete";
    t[231] = "Slet";
    t[242] = "Info";
    t[243] = "Info";
    t[244] = "Removed";
    t[245] = "Fjernet";
    t[246] = "Refresh page";
    t[247] = "Opdater side";
    t[248] = "Last";
    t[249] = "Sidste";
    t[250] = "Complete";
    t[251] = "Afslut";
    t[256] = "peers";
    t[257] = "peers";
    t[258] = "Normal";
    t[259] = "Normalt";
    t[262] = "Files";
    t[263] = "Filer";
    t[270] = "Restore defaults";
    t[271] = "Gendanne standarder";
    t[274] = "none";
    t[275] = "ingen";
    t[276] = "torrents";
    t[277] = "torrents";
    t[278] = "Delete Selected";
    t[279] = "Slet markedere  ";
    t[280] = "Downloaded";
    t[281] = "Downloaded";
    t[282] = "Configure";
    t[283] = "Konfigurer";
    t[288] = "Language";
    t[289] = "Sprog";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 145) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 143) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 290)
        idx -= 290;
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
        { while (idx < 290 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 290);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 290 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}