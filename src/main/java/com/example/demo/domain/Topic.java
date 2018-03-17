package com.example.demo.domain;




import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TOPIC")
public class Topic implements Serializable {

    @Id
    @Column(name="my_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer my_id;

    @Column(name="ID", unique=true, nullable=false)
    private String id;

    @Column(name="NAME", unique=true, nullable=false)
    private String name;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Topic() {

    }

    public String getId() {

        return id;
    }



    @Override

    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Column(name="DESCRIPTION", unique=true, nullable=false)
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Topic)) return false;

        Topic topic = (Topic) o;

        if (id != null ? !id.equals(topic.id) : topic.id != null) return false;
        if (name != null ? !name.equals(topic.name) : topic.name != null) return false;
        return description != null ? description.equals(topic.description) : topic.description == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }


}
