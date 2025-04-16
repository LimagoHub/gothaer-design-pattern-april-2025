package pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private String vorname="John";
    private String nachname="Doe";
    private String ort="Nowhere";
    private String strasse="Street";

   /* public Person() {
    }

    public Person(final String vorname, final String nachname, final String ort, final String strasse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.ort = ort;
        this.strasse = strasse;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(final String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(final String nachname) {
        this.nachname = nachname;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(final String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(final String strasse) {
        this.strasse = strasse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", ort='").append(ort).append('\'');
        sb.append(", strasse='").append(strasse).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
       private final Person person = new Person();

       public  PersonBuilder vorname(final String vorname) {
           person.setVorname(vorname);
           return this;
       }

       public  PersonBuilder nachname(final String nachname) {
           person.setNachname(nachname);
           return this;
       }
       public  PersonBuilder ort(final String ort) {
           person.setOrt(ort);
           return this;
       }
       public  PersonBuilder strasse(final String strasse) {
           person.setStrasse(strasse);
           return this;
       }

       public Person build() {
           // Cross FieldCheck
           return person;
       }
    }

    */
}
