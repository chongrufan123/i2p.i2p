/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.i2ptunnel.proxy;
public class messages_vi extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[76];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2021-02-05 15:27+0000\nLast-Translator: dich_tran <thnhan@gmail.com>\nLanguage-Team: Vietnamese (http://www.transifex.com/otf/I2P/language/vi/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: vi\nPlural-Forms: nplurals=1; plural=0;\n";
    t[6] = "Could not find the following destination:";
    t[7] = "t\u00ean hay \u0111i\u1ec3m \u0111\u1ebfn";
    t[8] = "Host";
    t[9] = "M\u00e1y ch\u1ee7";
    t[10] = "This seems to be a bad destination:";
    t[11] = "t\u00ean hay \u0111i\u1ec3m \u0111\u1ebfn";
    t[14] = "I2P HTTP Proxy Authorization Required";
    t[15] = "Cho ph\u00e9p Outproxy";
    t[26] = "private";
    t[27] = "ri\u00eang";
    t[28] = "Configuration";
    t[29] = "C\u1ea5u h\u00ecnh";
    t[30] = "Help";
    t[31] = "Gi\u00fap \u0111\u1ee1";
    t[38] = "Warning: Invalid Destination";
    t[39] = "\u0110i\u1ec3m \u0111\u1ebfn n\u1ed9i b\u1ed9";
    t[42] = "Generate";
    t[43] = "Ph\u00e1t ra";
    t[52] = "Destination";
    t[53] = "\u0110\u00edch \u0111\u1ebfn";
    t[54] = "Address Book";
    t[55] = "S\u1ed5 \u0111\u1ecba ch\u1ec9";
    t[58] = "router";
    t[59] = "b\u1ed9 \u0111\u1ecbnh tuy\u1ebfn";
    t[66] = "Addressbook";
    t[67] = "S\u1ed5 \u0111\u1ecba ch\u1ec9";
    t[68] = "Proxy Authorization Required";
    t[69] = "Cho ph\u00e9p Outproxy";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 38) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 76 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 76);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 76 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
