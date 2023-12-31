/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.util;
public class messages_fr extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[166];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P routerconsole\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-19 14:09+0000\nLast-Translator: AO <ao@localizationlab.org>, 2019\nLanguage-Team: French (https://www.transifex.com/otf/teams/12694/fr/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: fr\nPlural-Forms: nplurals=2; plural=(n > 1);\n";
    t[2] = "Dropping tunnel requests: High load";
    t[3] = "Abandon des requ\u00eates des tunnels\u00a0: charge \u00e9lev\u00e9e";
    t[4] = "Firewalled";
    t[5] = "Derri\u00e8re un pare-feu";
    t[10] = "IPv4: OK; IPv6: Firewalled";
    t[11] = "IPv4\u00a0: correct ; IPv6\u00a0: derri\u00e8re un pare-feu";
    t[12] = "Rejecting tunnels: Hidden mode";
    t[13] = "Refus de tunnels\u00a0: mode cach\u00e9";
    t[14] = "IPv4: Symmetric NAT; IPv6: OK";
    t[15] = "IPv4\u00a0: traduction d\u2019adresses r\u00e9seau sym\u00e9trique ; IPv6\u00a0: correct";
    t[20] = "Dropping tunnel requests: Overloaded";
    t[21] = "Abandon des requ\u00eates des tunnels\u00a0: surcharg\u00e9";
    t[24] = "Rejecting tunnels";
    t[25] = "Refus de tunnels";
    t[30] = "IPv4: Testing; IPv6: Firewalled";
    t[31] = "IPv4\u00a0: en test ; IPv6\u00a0: derri\u00e8re un pare-feu";
    t[38] = "Testing";
    t[39] = "En test";
    t[44] = "Rejecting tunnels: Bandwidth limit";
    t[45] = "Refus de tunnels\u00a0: limite de bande passante";
    t[54] = "Rejecting tunnels: Shutting down";
    t[55] = "Refus de tunnels\u00a0: fermeture";
    t[58] = "IPv4: Testing; IPv6: OK";
    t[59] = "IPv4\u00a0: en test ; IPv6\u00a0: correct";
    t[62] = "Rejecting tunnels: Request overload";
    t[63] = "Refus de tunnels\u00a0: surcharge de requ\u00eates";
    t[68] = "OK";
    t[69] = "Correct";
    t[70] = "Rejecting tunnels: Limit reached";
    t[71] = "Refus de tunnels\u00a0: limite atteinte";
    t[74] = "IPv4: Firewalled; IPv6: OK";
    t[75] = "IPv4\u00a0: derri\u00e8re un pare-feu ; IPv6\u00a0: correct";
    t[78] = "IPv4: Disabled; IPv6: Firewalled";
    t[79] = "IPv4\u00a0: d\u00e9sactiv\u00e9 ; IPv6\u00a0: derri\u00e8re un pare-feu";
    t[84] = "Accepting tunnels";
    t[85] = "Acceptation des tunnels";
    t[88] = "IPv4: Disabled; IPv6: OK";
    t[89] = "IPv4\u00a0: d\u00e9sactiv\u00e9 ; IPv6\u00a0: correct";
    t[92] = "Accepting most tunnels";
    t[93] = "Acceptation de la plupart des tunnels";
    t[94] = "Symmetric NAT";
    t[95] = "Traduction d\u2019adresses r\u00e9seau sym\u00e9trique";
    t[96] = "Rejecting most tunnels: Bandwidth limit";
    t[97] = "Refus de la plupart des tunnels\u00a0: limite de bande passante";
    t[98] = "Dropping tunnel requests: Queue time";
    t[99] = "Abandon des requ\u00eates des tunnels\u00a0: temps d\u2019attente";
    t[100] = "Dropping tunnel requests: High job lag";
    t[101] = "Abandon des requ\u00eates des tunnels\u00a0: d\u00e9calage important des travaux";
    t[102] = "Dropping tunnel requests: Too slow";
    t[103] = "Abandon des requ\u00eates des tunnels\u00a0: trop lent";
    t[104] = "Disconnected";
    t[105] = "D\u00e9connect\u00e9";
    t[106] = "Rejecting most tunnels: High number of requests";
    t[107] = "Refus de la plupart des tunnels\u00a0: nombre de requ\u00eates \u00e9lev\u00e9";
    t[124] = "Port Conflict";
    t[125] = "Conflit de ports";
    t[130] = "Rejecting tunnels: Starting up";
    t[131] = "Refus de tunnels\u00a0: d\u00e9marrage";
    t[132] = "Rejecting tunnels: High message delay";
    t[133] = "Refus de tunnels\u00a0: grand retard des messages";
    t[138] = "IPv4: Symmetric NAT; IPv6: Testing";
    t[139] = "IPv4\u00a0: traduction d\u2019adresses r\u00e9seau sym\u00e9trique ; IPv6\u00a0: en test";
    t[142] = "IPv4: Disabled; IPv6: Testing";
    t[143] = "IPv4\u00a0: d\u00e9sactiv\u00e9 ; IPv6\u00a0: en test";
    t[152] = "IPv4: OK; IPv6: Testing";
    t[153] = "IPv4\u00a0: correct ; IPv6\u00a0: en test";
    t[158] = "Rejecting tunnels: Connection limit";
    t[159] = "Refus de tunnels\u00a0: limite de connexions";
    t[164] = "IPv4: Firewalled; IPv6: Testing";
    t[165] = "IPv4\u00a0: derri\u00e8re un pare-feu ; IPv6\u00a0: en test";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 83) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 81) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 166)
        idx -= 166;
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
        { while (idx < 166 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 166);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 166 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
