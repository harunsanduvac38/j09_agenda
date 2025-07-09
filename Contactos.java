package agenda.util;

import java.util.HashSet;
import java.util.Set;

import agenda.modelo.Contacto;
import agenda.modelo.Domicilio;
import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoMemSerial;

public class Contactos {
	
	
	public static void main(String[] args) {
		ContactoDao dao = new ContactoDaoMemSerial();
		dao.buscarTodos().forEach(System.out::println);
	}
	
	
	public static Set<Contacto> generaContactos(){
		Set<Contacto> contactos = new HashSet<Contacto>();
		contactos.add(new Contacto(1, "Blaze", "Arsenio Holloway", "a,",new Domicilio ("Plaza", "429-5439 Ligula. Rd.", 21, 10, "F", "79344", "Alcobendas", "Madrid")));
		contactos.add(new Contacto(2, "Erasmus", "Micah Jones", "a,",new Domicilio ("Avendia", "7883 Justo. St.", 42, 7, "F", "62427", "Palma de Mallorca", "Illes Balears")));
		contactos.add(new Contacto(3, "Bert", "Harper Keller", "adipiscing",new Domicilio ("Avendia", "P.O. Box 718, 6995 Ut Road", 50, 7, "A", "14529", "Cordoba", "AN")));
		contactos.add(new Contacto(4, "Kadeem", "Perry Oliver", "Aliquam",new Domicilio ("Plaza", "4524 Tellus Road", 83, 10, "C", "57860", "Lugo", "GA")));
		contactos.add(new Contacto(5, "Elton", "Simon Ewing", "aliquet,",new Domicilio ("Plaza", "239-2788 Tristique Avenue", 17, 3, "F", "56884", "Telde", "Canarias")));
		contactos.add(new Contacto(6, "Nehru", "Bruce Macias", "aliquet,",new Domicilio ("Calle", "8560 Cursus, Rd.", 5, 9, "C", "59617", "L Hospitalet de Llobregat", "CA")));
		contactos.add(new Contacto(7, "Kieran", "Malik Burke", "amet,",new Domicilio ("Plaza", "Ap #474-2092 Quis Av.", 26, 2, "D", "56270", "Santa Cruz de Tenerife", "CN")));
		contactos.add(new Contacto(8, "Ulysses", "Raymond Small", "amet,",new Domicilio ("Calle", "Ap #971-8275 Eu, Rd.", 32, 4, "A", "13093", "Tarragona", "CA")));
		contactos.add(new Contacto(9, "Kasper", "Palmer Roberts", "ante",new Domicilio ("Calle", "Ap #444-7890 Nam St.", 43, 2, "D", "8723", "Gijón", "Principado de Asturias")));
		contactos.add(new Contacto(10, "Mannix", "Wylie Duffy", "augue",new Domicilio ("Avendia", "881-4665 Pede. Street", 52, 6, "C", "45179", "Palencia", "Castilla y León")));
		contactos.add(new Contacto(11, "George", "Xenos Villarreal", "commodo",new Domicilio ("Plaza", "837-9352 Nostra, Road", 40, 2, "B", "73842", "Zaragoza", "Aragón")));
		contactos.add(new Contacto(12, "Malcolm", "Kyle Michael", "commodo",new Domicilio ("Avendia", "Ap #195-7361 Nulla St.", 57, 9, "C", "47844", "Murcia", "MU")));
		contactos.add(new Contacto(13, "Clinton", "Porter Buck", "congue",new Domicilio ("Avendia", "7016 Consectetuer Rd.", 49, 0, "C", "88213", "Donosti", "PV")));
		contactos.add(new Contacto(14, "Charles", "Zeus Baird", "consectetuer",new Domicilio ("Calle", "991-1071 Urna, Av.", 87, 3, "F", "32964", "Torrejón de Ardoz", "Madrid")));
		contactos.add(new Contacto(15, "Alden", "Valentine Lucas", "Cras",new Domicilio ("Avendia", "7327 Morbi Rd.", 14, 6, "A", "24098", "Getafe", "Madrid")));
		contactos.add(new Contacto(16, "Alden", "Nissim Tate", "Cum",new Domicilio ("Plaza", "P.O. Box 164, 1054 Amet, St.", 93, 3, "B", "50669", "Telde", "CN")));
		contactos.add(new Contacto(17, "Dalton", "Carson Marshall", "cursus",new Domicilio ("Plaza", "1808 Nisl. Av.", 2, 8, "D", "29912", "Ourense", "Galicia")));
		contactos.add(new Contacto(18, "Warren", "Oren Buckner", "cursus",new Domicilio ("Avendia", "435-9032 Egestas St.", 62, 5, "C", "2904", "Fuenlabrada", "MA")));
		contactos.add(new Contacto(19, "Alfonso", "Lewis Dickerson", "diam.",new Domicilio ("Plaza", "Ap #752-8655 Tempor Avenue", 14, 4, "C", "50215", "Alacant", "Comunitat Valenciana")));
		contactos.add(new Contacto(20, "Theodore", "Yasir Britt", "dictum",new Domicilio ("Calle", "5965 Gravida Av.", 22, 8, "F", "96515", "Mataró", "Catalunya")));
		contactos.add(new Contacto(21, "Blake", "Dante Burks", "dignissim",new Domicilio ("Plaza", "Ap #436-7173 Non, Road", 86, 8, "B", "91127", "Valéncia", "CV")));
		contactos.add(new Contacto(22, "Boris", "Chandler Battle", "dolor.",new Domicilio ("Avendia", "5702 Arcu Road", 90, 10, "B", "84311", "Elx", "CV")));
		contactos.add(new Contacto(23, "Magee", "Baxter Fox", "Duis",new Domicilio ("Avendia", "Ap #994-7351 Aliquet Ave", 42, 0, "D", "17733", "Sabadell", "CA")));
		contactos.add(new Contacto(24, "Dennis", "Armand Blackwell", "eget",new Domicilio ("Plaza", "Ap #403-7822 Ornare, Street", 88, 2, "A", "29113", "Alcobendas", "MA")));
		contactos.add(new Contacto(25, "Colton", "Yasir Cain", "enim",new Domicilio ("Avendia", "Ap #599-1761 Luctus Road", 9, 1, "B", "42065", "Palma de Mallorca", "BA")));
		contactos.add(new Contacto(26, "Derek", "Rigel Farley", "enim.",new Domicilio ("Avendia", "P.O. Box 570, 7423 Pharetra. Rd.", 72, 5, "F", "77814", "Sabadell", "Catalunya")));
		contactos.add(new Contacto(27, "Hamilton", "Duncan Kirby", "enim.",new Domicilio ("Calle", "Ap #888-4255 Eu Rd.", 76, 6, "C", "97796", "Badalona", "CA")));
		contactos.add(new Contacto(28, "Oren", "Adam Sellers", "erat",new Domicilio ("Calle", "619-3008 Lorem Rd.", 100, 4, "D", "25163", "Torrevieja", "Comunitat Valenciana")));
		contactos.add(new Contacto(29, "Troy", "Hilel Delacruz", "eros",new Domicilio ("Calle", "185-1850 Quis Road", 14, 4, "B", "16845", "Torrejón de Ardoz", "Madrid")));
		contactos.add(new Contacto(30, "Ferris", "Jordan Schroeder", "et",new Domicilio ("Calle", "P.O. Box 788, 8567 Et St.", 71, 5, "B", "33895", "Parla", "Madrid")));
		contactos.add(new Contacto(31, "Emerson", "Xenos Charles", "eu",new Domicilio ("Plaza", "184-5820 Turpis. Road", 6, 3, "B", "81665", "Alacant", "Comunitat Valenciana")));
		contactos.add(new Contacto(32, "Jared", "Tanner Raymond", "eu",new Domicilio ("Calle", "397-5479 Nisl. Ave", 23, 7, "D", "1984", "Jaén", "AN")));
		contactos.add(new Contacto(33, "Moses", "Ezra Richards", "eu",new Domicilio ("Plaza", "651-1276 Euismod Street", 58, 9, "B", "1221", "Alcorcón", "Madrid")));
		contactos.add(new Contacto(34, "Eva", "Pelayo Bravo", "Evita",new Domicilio ("Calle", "Holanda", 16, 4, "C", "28806", "Alcala de Henares", "Madrid")));
		contactos.add(new Contacto(35, "Deacon", "Gavin Arnold", "facilisis",new Domicilio ("Plaza", "443-512 Id St.", 77, 4, "A", "57593", "Elx", "Comunitat Valenciana")));
		contactos.add(new Contacto(36, "Harding", "Aladdin Burt", "facilisis",new Domicilio ("Plaza", "5911 Ut St.", 64, 9, "B", "94957", "Teruel", "Aragón")));
		contactos.add(new Contacto(37, "Hector", "Emmanuel Sawyer", "facilisis",new Domicilio ("Calle", "Ap #915-4703 Auctor Rd.", 72, 2, "F", "9626", "Castelló", "CV")));
		contactos.add(new Contacto(38, "Cyrus", "Brent Velazquez", "faucibus",new Domicilio ("Calle", "Ap #108-8830 Libero. Street", 60, 4, "A", "54920", "Lugo", "Galicia")));
		contactos.add(new Contacto(39, "Ray", "Bruno Hensley", "felis.",new Domicilio ("Calle", "P.O. Box 841, 7116 Diam Rd.", 58, 3, "C", "97312", "Elx", "CV")));
		contactos.add(new Contacto(40, "Phillip", "Oren Fitzpatrick", "fermentum",new Domicilio ("Calle", "3331 Ut Avenue", 71, 5, "A", "85992", "Baracaldo", "Euskadi")));
		contactos.add(new Contacto(41, "Jeremy", "Arsenio Wong", "feugiat",new Domicilio ("Avendia", "1892 Felis, Ave", 86, 7, "B", "10219", "Pamplona", "Navarra")));
		contactos.add(new Contacto(42, "Keith", "Basil Preston", "Fusce",new Domicilio ("Calle", "820-9639 Maecenas St.", 89, 0, "B", "61028", "Alacant", "Comunitat Valenciana")));
		contactos.add(new Contacto(43, "Otto", "Mannix Wilson", "habitant",new Domicilio ("Calle", "566-4276 Dictum Rd.", 37, 6, "C", "40794", "Santa Coloma de Gramenet", "CA")));
		contactos.add(new Contacto(44, "Arden", "James Cooper", "hymenaeos.",new Domicilio ("Calle", "8909 Consequat, Street", 18, 6, "F", "73158", "Barcelona", "CA")));
		contactos.add(new Contacto(45, "Thomas", "Justin Alexander", "iaculis",new Domicilio ("Avendia", "168-2069 Sed Road", 85, 1, "C", "75862", "Valéncia", "CV")));
		contactos.add(new Contacto(46, "Melvin", "Gavin Hampton", "iaculis,",new Domicilio ("Avendia", "Ap #621-5405 Leo. Ave", 57, 4, "A", "58033", "Torrejón de Ardoz", "MA")));
		contactos.add(new Contacto(47, "Akeem", "Ishmael Blackwell", "id",new Domicilio ("Avendia", "957-1867 Nunc. Rd.", 12, 1, "D", "97922", "Torrejón de Ardoz", "MA")));
		contactos.add(new Contacto(48, "Roth", "Cairo Gay", "in",new Domicilio ("Plaza", "P.O. Box 540, 6461 Ante Avenue", 77, 8, "A", "51791", "Badalona", "Catalunya")));
		contactos.add(new Contacto(49, "Raja", "Gavin Newton", "interdum.",new Domicilio ("Plaza", "366-5035 In St.", 16, 10, "F", "32000", "Santa Coloma de Gramenet", "CA")));
		contactos.add(new Contacto(50, "Elton", "Guy Floyd", "ipsum",new Domicilio ("Calle", "814-3894 Dictum Avenue", 53, 7, "D", "27672", "Madrid", "Madrid")));
		contactos.add(new Contacto(51, "Jorge", "Cardozo Jimenez", "Jorgito",new Domicilio ("Avenida", "Castellana", 16, 0, "", "28100", "Madrid", "Madrid")));
		contactos.add(new Contacto(52, "Cole", "Travis Cantrell", "lacus.",new Domicilio ("Avendia", "2468 Ridiculus Rd.", 6, 2, "B", "52039", "L Hospitalet de Llobregat", "CA")));
		contactos.add(new Contacto(53, "Griffin", "Murphy Nicholson", "ligula.",new Domicilio ("Avendia", "P.O. Box 950, 3316 Molestie Rd.", 11, 9, "A", "37626", "Marbella", "Andalucía")));
		contactos.add(new Contacto(54, "Michael", "Rudyard Leonard", "ligula.",new Domicilio ("Plaza", "P.O. Box 730, 1041 Eu, Rd.", 82, 5, "C", "76532", "San Cristóbal de la Laguna", "Canarias")));
		contactos.add(new Contacto(55, "Zephania", "Hyatt Luna", "lorem",new Domicilio ("Avendia", "Ap #481-8961 Aliquam St.", 35, 5, "F", "36757", "Sabadell", "Catalunya")));
		contactos.add(new Contacto(56, "Brett", "Trevor Shields", "Maecenas",new Domicilio ("Avendia", "4967 Fringilla Rd.", 23, 4, "B", "6957", "Palencia", "CL")));
		contactos.add(new Contacto(57, "Abdul", "Burke Sharpe", "magna",new Domicilio ("Avendia", "P.O. Box 694, 6362 Cras St.", 43, 4, "B", "85261", "Valéncia", "Comunitat Valenciana")));
		contactos.add(new Contacto(58, "Zephania", "Ian Morin", "magnis",new Domicilio ("Plaza", "P.O. Box 763, 969 Commodo Rd.", 98, 8, "D", "24849", "Torrejón de Ardoz", "Madrid")));
		contactos.add(new Contacto(59, "Aladdin", "Paul Warren", "massa",new Domicilio ("Plaza", "4256 Nam St.", 44, 3, "F", "35872", "Tarrasa", "Catalunya")));
		contactos.add(new Contacto(60, "Tad", "Caesar Keller", "mattis.",new Domicilio ("Calle", "P.O. Box 329, 1813 Magnis Street", 20, 7, "B", "88320", "Gasteiz", "Euskadi")));
		contactos.add(new Contacto(61, "Anthony", "Quinn Calhoun", "mauris",new Domicilio ("Plaza", "2407 Condimentum. Street", 42, 4, "D", "66852", "Badalona", "CA")));
		contactos.add(new Contacto(62, "Orson", "Curran Walter", "Mauris",new Domicilio ("Plaza", "Ap #271-4041 Tellus Rd.", 78, 5, "A", "45795", "Alcobendas", "MA")));
		contactos.add(new Contacto(63, "Barry", "Vance Parrish", "mauris.",new Domicilio ("Avendia", "4564 Maecenas Rd.", 72, 8, "A", "69733", "Madrid", "MA")));
		contactos.add(new Contacto(64, "Cooper", "Brock Townsend", "molestie",new Domicilio ("Calle", "482-9088 Nunc Street", 93, 5, "F", "41572", "Cartagena", "Murcia")));
		contactos.add(new Contacto(65, "Ciaran", "Nissim Donovan", "mollis",new Domicilio ("Plaza", "P.O. Box 177, 9624 Libero Av.", 11, 6, "D", "15412", "Bilbo", "PV")));
		contactos.add(new Contacto(66, "Hayes", "Derek Burns", "montes,",new Domicilio ("Avendia", "229-8427 Aliquam Rd.", 13, 6, "B", "64699", "Cádiz", "Andalucía")));
		contactos.add(new Contacto(67, "Kareem", "Honorato Colon", "montes,",new Domicilio ("Avendia", "Ap #712-5270 Aliquam Rd.", 17, 3, "C", "88317", "Tarrasa", "CA")));
		contactos.add(new Contacto(68, "Reece", "Jelani Freeman", "mus.",new Domicilio ("Avendia", "Ap #625-3796 Quisque St.", 6, 0, "D", "26506", "Baracaldo", "Euskadi")));
		contactos.add(new Contacto(69, "Cruz", "Thane Hudson", "neque",new Domicilio ("Calle", "P.O. Box 688, 7201 Velit Ave", 70, 4, "A", "84720", "Almería", "AN")));
		contactos.add(new Contacto(70, "Dominic", "Barrett Patrick", "neque",new Domicilio ("Plaza", "P.O. Box 892, 8473 Vitae Street", 71, 9, "C", "46716", "Badajoz", "Extremadura")));
		contactos.add(new Contacto(71, "Leonard", "Orson Gray", "neque",new Domicilio ("Plaza", "9164 Mi St.", 61, 5, "F", "83757", "Pamplona", "NA")));
		contactos.add(new Contacto(72, "Jamal", "Steel Flynn", "netus",new Domicilio ("Calle", "P.O. Box 238, 9914 Habitant Rd.", 8, 10, "F", "90395", "Gijón", "Principado de Asturias")));
		contactos.add(new Contacto(73, "Vincent", "Mufutau Mcintosh", "non",new Domicilio ("Plaza", "Ap #840-6612 Neque Avenue", 48, 9, "C", "26106", "Pamplona", "Navarra")));
		contactos.add(new Contacto(74, "Elijah", "Camden Sullivan", "non,",new Domicilio ("Calle", "7327 Integer St.", 77, 0, "B", "65747", "Ciudad Real", "Castilla - La Mancha")));
		contactos.add(new Contacto(75, "Warren", "Arsenio William", "Nulla",new Domicilio ("Plaza", "8595 Non, Avenue", 80, 3, "C", "17514", "Ciudad Real", "Castilla - La Mancha")));
		contactos.add(new Contacto(76, "Nasim", "Edan Yates", "nunc",new Domicilio ("Calle", "Ap #625-559 Mauris. St.", 39, 5, "F", "84271", "Alacant", "Comunitat Valenciana")));
		contactos.add(new Contacto(77, "Tarik", "Wallace Chen", "nunc",new Domicilio ("Avendia", "624-5961 Congue. St.", 88, 10, "D", "94027", "Parla", "Madrid")));
		contactos.add(new Contacto(78, "Salvador", "Jonas Franks", "orci.",new Domicilio ("Plaza", "P.O. Box 458, 6372 Sem St.", 13, 3, "A", "17637", "Getafe", "MA")));
		contactos.add(new Contacto(79, "Abdul", "Perry Travis", "ornare,",new Domicilio ("Plaza", "2629 Mollis Avenue", 89, 9, "B", "13996", "L Hospitalet de Llobregat", "Catalunya")));
		contactos.add(new Contacto(80, "Brandon", "Jasper Hancock", "Proin",new Domicilio ("Avendia", "172-8569 Gravida Rd.", 7, 10, "C", "35062", "Ourense", "GA")));
		contactos.add(new Contacto(81, "Dexter", "Lyle Atkinson", "Proin",new Domicilio ("Avendia", "4004 Vitae Rd.", 62, 3, "F", "18188", "Teruel", "Aragón")));
		contactos.add(new Contacto(82, "Berk", "Hector Weber", "quis",new Domicilio ("Calle", "978-7004 Sociis Road", 52, 7, "C", "53794", "Murcia", "MU")));
		contactos.add(new Contacto(83, "Byron", "Armand Stafford", "Quisque",new Domicilio ("Avendia", "1336 Mauris St.", 48, 10, "B", "84578", "Badalona", "CA")));
		contactos.add(new Contacto(84, "Gabriel", "Byron Bass", "ridiculus",new Domicilio ("Plaza", "P.O. Box 258, 1909 Nulla Av.", 86, 7, "F", "94303", "Cáceres", "EX")));
		contactos.add(new Contacto(85, "Elton", "Oleg Bean", "sapien",new Domicilio ("Avendia", "620-6981 Nam Av.", 95, 10, "A", "11607", "Palma de Mallorca", "Illes Balears")));
		contactos.add(new Contacto(86, "Simon", "Brady Howard", "scelerisque,",new Domicilio ("Calle", "Ap #961-1952 Mauris Road", 26, 2, "F", "57170", "Elx", "CV")));
		contactos.add(new Contacto(87, "Jacob", "Aaron Bradford", "sed",new Domicilio ("Plaza", "8231 Ante Avenue", 38, 0, "B", "89349", "Palma de Mallorca", "BA")));
		contactos.add(new Contacto(88, "Trevor", "Sawyer Moses", "sociis",new Domicilio ("Plaza", "P.O. Box 852, 7819 Erat Rd.", 14, 6, "F", "82510", "Pamplona", "NA")));
		contactos.add(new Contacto(89, "Driscoll", "Jameson Christian", "Suspendisse",new Domicilio ("Avendia", "766-4147 Velit Road", 15, 8, "C", "21237", "Albacete", "CM")));
		contactos.add(new Contacto(90, "Tyrone", "Solomon Grant", "tellus",new Domicilio ("Plaza", "8196 Dictum Rd.", 18, 1, "F", "84478", "Sevilla", "Andalucía")));
		contactos.add(new Contacto(91, "Ignatius", "Amos Cooley", "tellus.",new Domicilio ("Avendia", "P.O. Box 638, 7633 Amet, St.", 44, 3, "C", "98822", "Tarragona", "CA")));
		contactos.add(new Contacto(92, "Trevor", "Tad Solis", "tellus.",new Domicilio ("Plaza", "Ap #847-442 Justo St.", 18, 10, "A", "39962", "Reus", "CA")));
		contactos.add(new Contacto(93, "Acton", "Owen Mcleod", "tincidunt",new Domicilio ("Plaza", "914-1381 Ullamcorper St.", 3, 1, "D", "28051", "Gijón", "Principado de Asturias")));
		contactos.add(new Contacto(94, "Marvin", "Forrest Reyes", "tincidunt.",new Domicilio ("Avendia", "1715 Morbi St.", 64, 2, "D", "56402", "Ávila", "Castilla y León")));
		contactos.add(new Contacto(95, "Jorge", "Ramirez", "Toro Bravo",new Domicilio ("Calle", "España", 368, 3, "B", "29400", "Ronda", "Malaga")));
		contactos.add(new Contacto(96, "Carl", "Hammett Branch", "tristique",new Domicilio ("Plaza", "P.O. Box 482, 409 Consequat Av.", 63, 9, "A", "41104", "Pamplona", "Navarra")));
		contactos.add(new Contacto(97, "Connor", "Mannix Torres", "turpis.",new Domicilio ("Calle", "Ap #741-3708 Nunc St.", 19, 9, "A", "86499", "Las Palmas", "CN")));
		contactos.add(new Contacto(98, "Price", "Elliott Sutton", "ut",new Domicilio ("Avendia", "P.O. Box 130, 2675 Eu, Ave", 37, 3, "F", "61867", "Cuenca", "Castilla - La Mancha")));
		contactos.add(new Contacto(99, "Howard", "Vernon Hawkins", "varius",new Domicilio ("Plaza", "258 Ridiculus St.", 97, 10, "A", "8241", "Salamanca", "Castilla y León")));
		contactos.add(new Contacto(100, "Giacomo", "Walker Hebert", "vehicula",new Domicilio ("Plaza", "659-8470 Ultricies Ave", 62, 6, "B", "87999", "Mataró", "Catalunya")));
		contactos.add(new Contacto(101, "Felix", "Channing Howe", "Vivamus",new Domicilio ("Plaza", "7658 Ultricies St.", 7, 2, "F", "47279", "Gijón", "AS")));
		contactos.add(new Contacto(102, "Aladdin", "Chase Banks", "vulputate",new Domicilio ("Calle", "Ap #792-8740 Vitae, Rd.", 96, 7, "D", "30672", "Parla", "Madrid")));
		return contactos;
	}
}
