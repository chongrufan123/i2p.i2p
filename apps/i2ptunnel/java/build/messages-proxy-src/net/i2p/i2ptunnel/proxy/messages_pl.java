/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.i2ptunnel.proxy;
public class messages_pl extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[622];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2021-02-07 22:01+0000\nLast-Translator: \u2606Verdulo\nLanguage-Team: Polish (http://www.transifex.com/otf/I2P/language/pl/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: pl\nPlural-Forms: nplurals=4; plural=(n==1 ? 0 : (n%10>=2 && n%10<=4) && (n%100<12 || n%100>14) ? 1 : n!=1 && (n%10>=0 && n%10<=1) || (n%10>=5 && n%10<=9) || (n%100>=12 && n%100<=14) ? 2 : 3);\n";
    t[2] = "Encryption key";
    t[3] = "Klucz szyfruj\u0105cy";
    t[4] = "If you do not save it, the host name will be forgotten after the next router restart.";
    t[5] = "Je\u015bli nie zapiszesz, nazwa zostanie zapomniana przy wy\u0142\u0105czeniu lub restarcie w\u0119z\u0142\u0105 I2P.";
    t[8] = "Website Unknown";
    t[9] = "Nieznana strona www";
    t[12] = "Copy the key and send it to the server operator.";
    t[13] = "Skopiuj klucz i wy\u015blij go do administratora serwera.";
    t[14] = "The website could be temporarily unavailable, too busy, or it has blocked your access.";
    t[15] = "Strona mo\u017ce by\u0107 tymczasowo niedost\u0119pna, przeci\u0105\u017cona, lub zablokowa\u0142a Ci dost\u0119p.";
    t[22] = "Router Console";
    t[23] = "Konsola w\u0119z\u0142a";
    t[26] = "Check the link or find a Base 32 or Base 64 address.";
    t[27] = "Sprawd\u017a link lub poszukaj adresu Base32 lub Base64.";
    t[32] = "The HTTP outproxy was not reachable, because it uses encryption options that are not supported by your I2P or Java version.";
    t[33] = "Proxy wyj\u015bciowe jest niedost\u0119pne, gdy\u017c u\u017cywa metody szyfrowania nieobs\u0142ugiwanej przez Tw\u00f3j w\u0119ze\u0142 I2P lub jav\u0119.";
    t[38] = "The website was not reachable, because it uses encryption options that are not supported by your I2P or Java version.";
    t[39] = "Strona jest niedost\u0119pna, gdy\u017c u\u017cywa metody szyfrowania nieobs\u0142ugiwanej przez Tw\u00f3j w\u0119ze\u0142 I2P lub jav\u0119.";
    t[44] = "The website was not reachable, because its lease set was not found.";
    t[45] = "Strona nieosi\u0105galna, poniewa\u017c jej LeaseSet nie zosta\u0142 znaleziony.";
    t[46] = "Warning: Destination Key Conflict";
    t[47] = "Ostrze\u017cenie: konflikt kluczy cel\u00f3w";
    t[48] = "Website Unreachable";
    t[49] = "Strona niedost\u0119pna.";
    t[54] = "You may save this host name to your local address book.";
    t[55] = "Mo\u017cesz zapisa\u0107 t\u0119 nazw\u0119 hosta w swojej lokalnej ksi\u0105\u017cce adresowej.";
    t[56] = "Continue to {0} without saving";
    t[57] = "Kontynuuj do {0} bez zapisywania";
    t[58] = "To disable authorization, remove the configuration {0}i2ptunnel.proxy.auth=basic{1}, then stop and restart the HTTP Proxy tunnel.";
    t[59] = "Aby wy\u0142\u0105czy\u0107 autoryzacj\u0119, usu\u0144 konfiguracj\u0119 {0}i2ptunnel.proxy.auth=basic{1} i zatrzymaj i zrestartuj tunel proxy HTTP.";
    t[62] = "Go back and fix the error";
    t[63] = "Powr\u00f3\u0107 i napraw b\u0142\u0105d";
    t[64] = "Save {0} to router address book and continue to website";
    t[65] = "Zapisz {0} do ksi\u0105\u017cki adresowej w\u0119z\u0142a i przejd\u017a na stron\u0119 www";
    t[66] = "Warning: Non-HTTP Protocol";
    t[67] = "Ostrze\u017cenie: protok\u00f3\u0142 inny ni\u017c HTTP";
    t[70] = "The helper key in the URL ({0}i2paddresshelper={1}) is not resolvable.";
    t[71] = "Klucz pomocniczy w URL-u ({0}i2paddresshelper={1}) jest nieosi\u0105galny.";
    t[72] = "The connection to the website was reset while the page was loading.";
    t[73] = "Po\u0142\u0105czenie z t\u0105 stron\u0105 zosta\u0142o zresetowane podczas \u0142adowania strony.";
    t[74] = "Do not use the proxy to access the router console, localhost, or local LAN destinations.";
    t[75] = "Nie u\u017cywaj proxy do po\u0142\u0105cze\u0144 z konsol\u0105 w\u0119z\u0142a I2P, hostem lokalnym (127.0.0.1) lub hostami w sieci lokalnej (LAN).";
    t[80] = "Warning: Invalid Destination";
    t[81] = "Ostrze\u017cenie: nieprawid\u0142owy cel";
    t[82] = "Perhaps you pasted in the wrong Base 64 string or the link you are following is bad.";
    t[83] = "Mo\u017ce wpisa\u0142e\u015b b\u0142\u0119dny ci\u0105g Base64 lub klikni\u0119ty link jest nieprawid\u0142owy.";
    t[86] = "Warning: Authorization Required";
    t[87] = "Ostrze\u017cenie: wymagana autoryzacja";
    t[88] = "This address will be saved to your Local address book. Select this option for addresses you wish to keep separate from the main router address book, but don't mind publishing.";
    t[89] = "Ten adres zostanie zapisany do Twojej lokalnej ksi\u0105\u017cki adresowej. Wybierz t\u0119 opcj\u0119 dla adres\u00f3w, kt\u00f3re chcesz trzyma\u0107 oddzielnie od g\u0142\u00f3wnej ksi\u0105\u017cki adresowej w\u0119z\u0142a i nie chcesz ich publikowa\u0107.";
    t[94] = "Missing lookup password";
    t[95] = "Brak has\u0142a podgl\u0105du";
    t[98] = "I2P HTTP Proxy Authorization Required";
    t[99] = "Wymagana autoryzacja proxy HTTP I2P";
    t[100] = "You may want to {0}retry{1} as this will randomly reselect an outproxy from the pool you have defined {2}here{3} (if you have more than one configured).";
    t[101] = "Mo\u017cesz {0}spr\u00f3bowa\u0107 ponownie{1} co wybierze losowe proxy wyj\u015bciowe ze zbioru kt\u00f3ry skonfigurowa\u0142e\u015b {2}tutaj{3} (je\u017celi skonfigurowa\u0142e\u015b wi\u0119cej ni\u017c jedno).";
    t[104] = "Lookup password";
    t[105] = "Has\u0142o podgl\u0105du";
    t[106] = "Help";
    t[107] = "Pomoc";
    t[118] = "Website Not Found in Addressbook";
    t[119] = "Nie znaleziono strony www w ksi\u0105\u017cce adresowej";
    t[124] = "Error: Request Denied";
    t[125] = "B\u0142\u0105d: zapytanie odrzucone";
    t[130] = "i2paddresshelper cannot help you with a destination like that!";
    t[131] = "i2paddresshelper, pomocnik adresowy i2p, nie mo\u017ce pom\u00f3c ci z takim celem!";
    t[134] = "Warning: Request Denied";
    t[135] = "Ostrze\u017cenie: zapytanie odrzucone";
    t[136] = "Ask the server operator for help.";
    t[137] = "Popro\u015b administratora serwera o pomoc.";
    t[138] = "The proxy could be temporarily unavailable, too busy, or it has blocked your access.";
    t[139] = "Proxy mo\u017ce by\u0107 tymczasowo niedost\u0119pne, przeci\u0105\u017cone, lub zablokowa\u0142o Ci dost\u0119p.";
    t[140] = "This address will be saved to your Router address book where your subscription-based addresses are stored.";
    t[141] = "Adres zostanie zapisany w ksi\u0105\u017cce adresowej Twojego w\u0119z\u0142a gdzie s\u0105 przechowywane adresy z subskrypcji.";
    t[144] = "This seems to be a bad destination:";
    t[145] = "Wydaje si\u0119 to by\u0107 z\u0142ym celem:";
    t[148] = "Check your URL to try and fix the helper key to be a valid Base 32 hostname or Base 64 key.";
    t[149] = "Sprawd\u017a ten URL i spr\u00f3buj naprawi\u0107 klucz pomocniczy, aby sta\u0142 si\u0119 poprawnym adresem hosta Base32 lub Base64.";
    t[152] = "The I2P HTTP Proxy supports HTTP and HTTPS requests only.";
    t[153] = "To proxy obs\u0142uguje wy\u0142\u0105cznie protoko\u0142y HTTP i HTTPS.";
    t[156] = "Proxy Authorization Required";
    t[157] = "Wymagana autoryzacja proxy";
    t[160] = "You attempted to connect to a non-I2P website or location.";
    t[161] = "Spr\u00f3bowa\u0142e\u015b po\u0142\u0105czy\u0107 si\u0119 nie ze stron\u0105 lub miejscem w sieci I2P.";
    t[162] = "The website was not found in your router's addressbook.";
    t[163] = "Nie odnaleziono strony w ksi\u0105\u017cce adresowej w\u0119z\u0142a.";
    t[164] = "Address Book";
    t[165] = "Ksi\u0105\u017cka adresowa";
    t[168] = "Base32 address decryption failure, check encryption key";
    t[169] = "B\u0142\u0105d deszyfracji adresu Base32, sprawd\u017a klucz szyfruj\u0105cy";
    t[170] = "Outproxy Unreachable";
    t[171] = "Proxy wyj\u015bciowe niedost\u0119pne";
    t[172] = "If you do not wish to visit this host, click the \"back\" button on your browser.";
    t[173] = "Je\u015bli nie chcesz odwiedza\u0107 tego hosta, kliknij guzik \"wstecz\" w swojej przegl\u0105darce www.";
    t[182] = "You may want to {0}retry{1}.";
    t[183] = "Mo\u017cesz {0}powt\u00f3rzy\u0107{1}.";
    t[190] = "It is offline, there is network congestion, or your router is not yet well-integrated with peers.";
    t[191] = "Jest wy\u0142\u0105czona lub sie\u0107 jest zat\u0142oczona lub Tw\u00f3j w\u0119ze\u0142 nie jest dobrze zintegrowany z u\u017cytkownikami.";
    t[202] = "Your request was for a site outside of I2P, but you have no HTTP outproxy configured.";
    t[203] = "Zapytano o stron\u0119 poza sieci\u0105 I2P, lecz nie masz skonfigurowanego proxy wyj\u015bciowego HTTP.";
    t[204] = "Resolve the conflict by deciding which key you trust, and then either ignore the address helper link, or delete the host entry from your address book and click the address helper link again.";
    t[205] = "Rozwi\u0105\u017c konflikt poprzez zdecydowanie kt\u00f3remu kluczowi ufasz, a nast\u0119pnie zignoruj ten link z pomocnikiem adresu, lub usu\u0144 wpis hosta z Twojej ksi\u0105\u017cki adresowej i ponownie kliknij w link z pomocnikiem adresu.";
    t[212] = "Could not connect to the following destination:";
    t[213] = "Nie mo\u017cna po\u0142\u0105czy\u0107 z nast\u0119puj\u0105cym celem:";
    t[214] = "You must either enter a PSK encryption key provided by the server operator, or generate a DH encryption key and send that to the server operator.";
    t[215] = "Musisz albo wprowadzi\u0107 klucz szyfruj\u0105cy PSK dostarczony przez administratora serwera, albo wygenerowa\u0107 klucz szyfruj\u0105cy DH i wys\u0142a\u0107 go do administratora serwera.";
    t[216] = "The address helper link you followed is for a new host name that is not in your address book.";
    t[217] = "Klikni\u0119ty link z pomocnikiem adres\u00f3w prowadzi do nowej nazwy hosta kt\u00f3rej nie ma w Twojej ksi\u0105\u017cce adresowej.";
    t[218] = "Someone could be trying to impersonate another website, or people have given two websites identical names.";
    t[219] = "Kto\u015b mo\u017ce pr\u00f3bowa\u0107 podszy\u0107 si\u0119 pod inn\u0105 stron\u0119, lub ludzie nazwali dwie strony identycznie.";
    t[220] = "Missing private key";
    t[221] = "Brak klucza prywatnego";
    t[230] = "Please configure an outproxy in I2PTunnel.";
    t[231] = "Prosz\u0119 skonfigurowa\u0107 proxy wyj\u015bciowe w ust. ukrytych us\u0142ug I2P.";
    t[232] = "Please enter your username and password, or check your {0}router configuration{1} or {2}I2PTunnel configuration{3}.";
    t[233] = "Prosz\u0119 wpisz swoj\u0105 nazw\u0119 u\u017cytkownika i has\u0142o, albo sprawd\u017a {0}router konfiguracj\u0119{1} lub {2}I2PTunnel konfiguracj\u0119{3}.";
    t[236] = "Added via address helper from {0}";
    t[237] = "Dodano poprzez pomocnika adres\u00f3w {0}";
    t[238] = "Configuration";
    t[239] = "Konfiguracja";
    t[242] = "Conflicting address helper destination";
    t[243] = "Koliduj\u0105cy adres przeznaczenia z pomocnika adres\u00f3w";
    t[246] = "The outproxy is probably down, but there could also be network congestion.";
    t[247] = "To proxy wyj\u015bciowe jest prawdopodobnie martwe, ale mo\u017ce to by\u0107 tylko zakorkowanie sieci.";
    t[250] = "Continue without saving";
    t[251] = "Kontynuuj bez zapisywania";
    t[256] = "Warning: No Outproxy Configured";
    t[257] = "Ostrze\u017cenie: nie ustawiono proxy wyj\u015bciowego";
    t[260] = "Addressbook";
    t[261] = "Ksi\u0105\u017cka adresowa";
    t[266] = "Information: New Host Name";
    t[267] = "Informacja: nowa nazwa hosta";
    t[276] = "Seeing this page often? See {0}the FAQ{1} for help in {2}adding some subscriptions{3} to your addressbook.";
    t[277] = "Widzisz t\u0105 stron\u0119 zbyt cz\u0119sto? Zobacz {0}FAQ{1} po pomoc o {2}dodanie nowych subskrypcji{3} do Twojej ksi\u0105\u017cki adresowej.";
    t[286] = "Saved the authentication for {0}, redirecting now.";
    t[287] = "Zapisano po\u015bwiadczenia dla {0}, przekierowuj\u0119.";
    t[290] = "If you want to keep track of sites you have added manually, add to your Local or Private address book instead.";
    t[291] = "Je\u017celi chcesz cz\u0119sto odwiedza\u0107 strony, kt\u00f3re dodajesz r\u0119cznie, dodaj je do lokalnej lub prywatnej ksi\u0105\u017cki adresowej.";
    t[292] = "Your browser is misconfigured.";
    t[293] = "Twoja przegl\u0105darka www jest niepoprawnie skonfigurowana.";
    t[300] = "The address helper link you followed specifies a different destination key than the entry in your address book.";
    t[301] = "Klikni\u0119ty link z pomocnikiem adresu zawiera inny adres przeznaczenia ni\u017c ten w Twojej ksi\u0105\u017cce adresowej.";
    t[302] = "Added via address helper";
    t[303] = "Dodano poprzez pomocnika adres\u00f3w";
    t[304] = "If you have the Base 64 address, {0}add it to your addressbook{1}.";
    t[305] = "Je\u015bli masz adres Base64, {0}dodaj go do swojej ksi\u0105\u017cki adresowej{1}.";
    t[306] = "Outproxy Not Found";
    t[307] = "Nie znaleziono proxy wyj\u015bciowego";
    t[310] = "The Base32 address is invalid.";
    t[311] = "Adres Base32 jest nieprawid\u0142owy.";
    t[316] = "I2P Router Console";
    t[317] = "Konsola w\u0119z\u0142a I2P";
    t[320] = "You must enter the password provided by the server operator.";
    t[321] = "Musisz wpisa\u0107 has\u0142o dostarczone przez administratora serwera.";
    t[322] = "Warning: Invalid Request URI";
    t[323] = "Ostrze\u017cenie: nieprawid\u0142owe URI \u017c\u0105dania";
    t[328] = "Save {0} to local address book and continue to website";
    t[329] = "Zapisz {0} do lokalnej ksi\u0105\u017cki adresowej, a nast\u0119pnie otw\u00f3rz stron\u0119";
    t[346] = "Redirecting to {0}";
    t[347] = "Przekierowywuje do {0}";
    t[358] = "Address book";
    t[359] = "Ksi\u0105\u017cka Adresowa";
    t[368] = "Base32";
    t[369] = "Base32";
    t[370] = "This proxy is configured to require a username and password for access.";
    t[371] = "To proxy wymaga nazwy u\u017cytkownika i has\u0142a.";
    t[372] = "Could not find the following destination:";
    t[373] = "Nie mo\u017cna odnale\u017a\u0107 nast\u0119puj\u0105cego adresu przeznaczenia:";
    t[380] = "The website was not reachable.";
    t[381] = "Strona www by\u0142a nieosi\u0105galna.";
    t[382] = "If you clicked a link, check the end of the URI for any characters the browser has mistakenly added on.";
    t[383] = "Je\u017celi klikn\u0105\u0142e\u015b na link, sprawd\u017a koniec adresu pod k\u0105tem znak\u00f3w kt\u00f3re przegl\u0105darka mog\u0142a omy\u0142kowo doda\u0107.";
    t[384] = "private";
    t[385] = "prywatnej";
    t[390] = "Generate";
    t[391] = "Utw\u00f3rz";
    t[392] = "Generate new DH encryption key";
    t[393] = "Wygeneruj nowy klucz szyfruj\u0105cy DH";
    t[396] = "Otherwise, find a Base 32 or address helper link, or use a jump service link below.";
    t[397] = "W przeciwnym razie, znajd\u017a adres Base32 lub link z pomocnikiem adres\u00f3w, lub u\u017cyj poni\u017cszych us\u0142ug skok\u00f3w.";
    t[402] = "Invalid private key";
    t[403] = "Nieprawid\u0142owy klucz prywatny";
    t[404] = "The request uses a bad protocol.";
    t[405] = "Zapytanie u\u017cywa z\u0142ego protoko\u0142u.";
    t[406] = "The request URI is invalid, and probably contains illegal characters.";
    t[407] = "\u017b\u0105dany URI jest nieprawid\u0142owy i prawdopodobnie zawiera niedozwolone znaki.";
    t[408] = "To visit the destination in your address book, click <a href=\"{0}\">here</a>. To visit the conflicting addresshelper destination, click <a href=\"{1}\">here</a>.";
    t[409] = "Aby przej\u015b\u0107 pod adres z Twojej ksi\u0105\u017cki adresowej kliknij <a href=\"{0}\">tutaj</a>. Aby przej\u015b\u0107 pod koliduj\u0105cy adres z pomocnika adres\u00f3w kliknij <a href=\"{1}\">tutaj</a>.";
    t[412] = "Click here if you are not redirected automatically.";
    t[413] = "Kliknij tutaj, je\u017celi nie jeste\u015b automatycznie przekierowany.";
    t[420] = "Saved {0} to the {1} address book, redirecting now.";
    t[421] = "Zapisano {0} do ksi\u0105\u017cki adresowej {1}, przekierowuj\u0119.";
    t[432] = "It seems to be garbage data, or a mistyped Base 32 address.";
    t[433] = "Wygl\u0105da to na przypadkowe dane lub b\u0142\u0119dny adres Base32.";
    t[444] = "Destination lease set not found";
    t[445] = "LeaseSet adresu przeznaczenia nie odnaleziony";
    t[458] = "Save {0} to private address book and continue to website";
    t[459] = "Zapisz {0} do prywatnej ksi\u0105\u017cki adresowej i przejd\u017a na stron\u0119 www";
    t[472] = "The connection to the proxy was reset.";
    t[473] = "Po\u0142\u0105czenie z proxy zosta\u0142o zresetowane.";
    t[486] = "The website destination specified was not valid, or was otherwise unreachable.";
    t[487] = "Podany adres przeznaczenia strony jest nieprawid\u0142owy, lub nieosi\u0105galny.";
    t[492] = "Base32 address requires encryption key";
    t[493] = "Adres Base32 wymaga klucza szyfruj\u0105cego";
    t[500] = "You can browse to the site without saving it to the address book. The address will be remembered until you restart your I2P router.";
    t[501] = "Mo\u017cesz przej\u015b\u0107 do strony bez zapisywania jej do ksi\u0105\u017cki adresowej. Adres zostanie zapami\u0119tany do nast\u0119pnego uruchomienia w\u0119z\u0142a I2P.";
    t[502] = "Connection Reset";
    t[503] = "Po\u0142\u0105czenie zresetowane";
    t[504] = "Destination";
    t[505] = "Cel";
    t[508] = "The website is probably down, but there could also be network congestion.";
    t[509] = "Ta strona jest prawdopodobnie martwa, ale mo\u017ce to by\u0107 tylko zakorkowanie sieci.";
    t[522] = "Corrupt Base32 address";
    t[523] = "Nieprawid\u0142owy adres Base32";
    t[524] = "Error: Local Access";
    t[525] = "B\u0142\u0105d: adres lokalny";
    t[530] = "Base32 address requires encryption key and lookup password";
    t[531] = "Adres Base32 wymaga klucza szyfruj\u0105cego i has\u0142a podgl\u0105du";
    t[534] = "Destination for {0} in address book";
    t[535] = "Adres przeznaczenia dla {0} w ksi\u0105\u017cce adresowej.";
    t[536] = "The HTTP outproxy was not reachable, because its lease set was not found.";
    t[537] = "To proxy wyj\u015bciowe HTTP jest nieosi\u0105galne, poniewa\u017c jego LeaseSet nie zosta\u0142 odnaleziony.";
    t[538] = "Enter PSK encryption key";
    t[539] = "Wprowad\u017a klucz szyfruj\u0105cy PSK";
    t[542] = "The HTTP Outproxy was not found.";
    t[543] = "Nie znaleziono proxy wyj\u015bciowego HTTP.";
    t[544] = "If you save it to your address book, you will not see this message again.";
    t[545] = "Je\u015bli zapiszesz do ksi\u0105\u017cki adresowej, nie zobaczysz ponowniej tej wiadomo\u015bci.";
    t[558] = "Warning: Bad Address Helper";
    t[559] = "Ostrze\u017cenie: nieprawid\u0142owy pomocnik adresu ";
    t[564] = "Save & continue";
    t[565] = "Zapisz i kontynuuj";
    t[568] = "Failed to save {0} to the {1} address book, redirecting now.";
    t[569] = "Nie uda\u0142o si\u0119 zapisa\u0107 {0} do ksi\u0105\u017cki adresowej {1}, przekierowuj\u0119.";
    t[570] = "This address will be saved to your Private address book, ensuring it is never published.";
    t[571] = "Ten adres zostanie zapisany w Twojej prywatnej ksi\u0105\u017cce adresowej, co zapewni, \u017ce nie zostanie on opublikowany.";
    t[580] = "Host";
    t[581] = "Host";
    t[582] = "Other protocols such as FTP are not allowed.";
    t[583] = "Inne protoko\u0142y, jak np. FTP, s\u0105 niepoprawne.";
    t[588] = "Base32 address requires lookup password";
    t[589] = "Adres Base32 wymaga has\u0142a podgl\u0105du";
    t[590] = "Information: New Host Name with Address Helper";
    t[591] = "Informacja: nowa nazwa hosta z Pomocnikiem Adres\u00f3w";
    t[592] = "If you continue to have trouble you may want to edit your outproxy list {0}here{1}.";
    t[593] = "Je\u017celi dalej masz problem, mo\u017cesz spr\u00f3bowa\u0107 edycji Twojej listy proxy wyj\u015bciowych {0}tutaj{1}.";
    t[610] = "The website is offline, there is network congestion, or your router is not yet well-integrated with peers.";
    t[611] = "Strona jest wy\u0142\u0105czona lub siec jest zat\u0142oczona lub Tw\u00f3j w\u0119ze\u0142 nie jest dobrze zintegrowany z sieci\u0105 I2P.";
    t[612] = "The I2P host could also be offline.";
    t[613] = "Host m\u00f3g\u0142 by\u0107 r\u00f3wnie\u017c wy\u0142\u0105czony.";
    t[614] = "local";
    t[615] = "lokalny";
    t[616] = "router";
    t[617] = "w\u0119z\u0142a";
    t[618] = "After you are granted permission, you may proceed to the website.";
    t[619] = "Po udzieleniu zgody, b\u0119dziesz m\u00f3g\u0142/mog\u0142a przej\u015b\u0107 na stron\u0119.";
    t[620] = "Your new encryption key";
    t[621] = "Tw\u00f3j nowy klucz szyfruj\u0105cy";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 311) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 309) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 622)
        idx -= 622;
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
        { while (idx < 622 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 622);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 622 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
