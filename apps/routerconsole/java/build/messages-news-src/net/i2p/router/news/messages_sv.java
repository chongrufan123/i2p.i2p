/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.news;
public class messages_sv extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[56];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2013-07-20 14:49+0000\nLast-Translator: Jonatan Nyberg <jonatan@autistici.org>, 2016-2017,2021-2022\nLanguage-Team: Swedish (Sweden) (http://www.transifex.com/otf/I2P/language/sv_SE/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: sv_SE\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Welcome to I2P!";
    t[3] = "V\u00e4lkommen till I2P!";
    t[4] = "Just enter 127.0.0.1 (or localhost) port 4444 as a http proxy into your browser settings.";
    t[5] = "Skriv in 127.0.0.1 (eller localhost) port 4444 som en http-proxy i din webbl\u00e4sares inst\u00e4llningar.";
    t[6] = "I2P Development Team";
    t[7] = "I2P-utvecklarteam";
    t[12] = "Once you have a \"shared clients\" destination listed on the left, please {0}check out{1} our {2}FAQ{3}.";
    t[13] = "N\u00e4r du har f\u00e5tt en \"delade klienter\" destination till v\u00e4nster, {0}l\u00e4s{1} v\u00e5ra {2}Vanliga fr\u00e5gor{3}.";
    t[14] = "Please {0}have patience{1} as I2P boots up and finds peers.";
    t[15] = "{0}Ha t\u00e5lamod{1} medan I2P startar och hittar j\u00e4mlikar.";
    t[16] = "Also you can setup your browser to use the I2P proxy to reach eepsites.";
    t[17] = "Du kan \u00e4ven st\u00e4lla in din webbl\u00e4sare till att anv\u00e4nda I2P-proxyn f\u00f6r att n\u00e5 eepsidor.";
    t[20] = "Congratulations on getting I2P installed!";
    t[21] = "Gratulerar till din I2P-installation!";
    t[32] = "More information can be found on the {0}I2P browser proxy setup page{1}.";
    t[33] = "Mer information finns p\u00e5 {0}inst\u00e4llningssidan f\u00f6r I2P-webbl\u00e4sarproxy{1}.";
    t[34] = "Point your IRC client to {0}localhost:6668{1} and say hi to us on {2}#i2p{3}.";
    t[35] = "Peka din IRC-klient till {0}localhost:6668{1} och s\u00e4g hej till oss p\u00e5 {2}#i2p{3}.";
    t[44] = "While you are waiting, please {0}adjust your bandwidth settings{1} on the {2}configuration page{3}.";
    t[45] = "Medan du v\u00e4ntar, {0}st\u00e4ll in dina bandbredd- och portinst\u00e4llningar{1} p\u00e5 {2}konfigurationssidan{3}.";
    t[50] = "Do not use SOCKS for this.";
    t[51] = "Anv\u00e4nd inte SOCKS f\u00f6r detta.";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 28) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 56 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 56);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 56 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
