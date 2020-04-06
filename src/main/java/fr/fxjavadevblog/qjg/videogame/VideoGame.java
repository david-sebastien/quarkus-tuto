package fr.fxjavadevblog.qjg.videogame;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import fr.fxjavadevblog.qjg.utils.InjectedUUID;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of = "id")
@ToString(of = { "id", "name" })

// CDI Annotation
@Dependent

// JPA Annotation
@Entity
@Table(name = "VIDEO_GAME")
public class VideoGame implements Serializable
{
    @Id
    @Inject
    @InjectedUUID
    @Getter
    @Column(length = 36)
    String id;

    @Getter
    @Setter
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "GENRE", nullable = false)
    private Genre genre;

    @Version
    @Getter
    @Column(name = "VERSION")
    private Long version;
}