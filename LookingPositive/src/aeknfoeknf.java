import java.time.LocalDate;
import java.util.ArrayList;

public class aeknfoeknf {

	public static void main(String[] args) {
		LocalDate veryoldDate = LocalDate.of(2020, 12, 01);
		ArrayList<Profiles> contactedpeople = new ArrayList<>();
		LocalDate oldDate = LocalDate.of(2020, 12, 01);
		LocalDate newDate = LocalDate.of(2020, 12, 02);
		
		Profiles katerina = new Profiles("katerina" , 0);
		Profiles elisavet = new Profiles("elisavet" , 1);
		Profiles mpampinos = new Profiles("mpampinos" , 2);
		
		//int x = c.compareTo(k);
		contactedpeople.add(katerina);
		contactedpeople.add(elisavet);
		contactedpeople.add(mpampinos);
		Eventsaver.today.createarraylistofevents(0);
		Eventsaver.today.createarraylistofevents(1);
		Eventsaver.today.createarraylistofevents(2);
		Eventsaver.future.createarraylistofevents(0);
		Eventsaver.future.createarraylistofevents(1);
		Eventsaver.future.createarraylistofevents(2);
		Eventsaver.replicatoday.createarraylistofevents(0);
		Eventsaver.replicatoday.createarraylistofevents(1);
		Eventsaver.replicatoday.createarraylistofevents(2);
		/*for(int i = 0 ; 13> i ; i++) {
		Eventsaver.fourteendays[i].createarraylistofevents(0);
		Eventsaver.fourteendays[i].createarraylistofevents(1);
		Eventsaver.fourteendays[i].createarraylistofevents(2);
		}*/
		Event event1 = new Event(veryoldDate,"karamanlis",contactedpeople);
		Event event2 = new Event(oldDate ,"koula",contactedpeople);
		Event event3 = new Event(newDate,"marina",contactedpeople);
		Eventsaver.addevent(event1, 0 , 1);
		Eventsaver.addevent(event2, 1 , 1);
		Eventsaver.addevent(event3, 2 , 2);
		//Eventsaver.deleteexpiredevents(p,c);
		Eventsaver.deleteexpiredevents(LocalDate.of(2020,12,02) ,LocalDate.of(2020, 11, 01));
		//Eventsaver.deleteexpiredevents(k,p);
		//System.out.println(x)
		//Eventsaver.future.deleteevent();
		System.out.println("BegintodayMain");
		for(int i = 0 ; i < Eventsaver.today.eventlist.size() ; i++ ) {
			for(int j = 0; j < Eventsaver.today.eventlist.get(i).size(); j++) {
				
				System.out.println(Eventsaver.today.eventlist.get(i).get(j));
				
			}
			}
		System.out.println("EndtodayMain");
		
		for(int kol = 0 ; kol < 1 ; kol++) {
			System.out.println("day" + kol);
			for(int i = 0 ; i < Eventsaver.fourteendays[kol].eventlist.size() ; i++ ) {
				System.out.println("person");
				for(int j = 0; j < Eventsaver.fourteendays[kol].eventlist.get(i).size() ; j++) {
					System.out.println(Eventsaver.fourteendays[kol].eventlist.get(i).get(j));
		
				}}}
		
		}

	}
