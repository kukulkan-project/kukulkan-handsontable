package mx.infotec.dads.kukulkan.tables;

import java.io.Serializable;
import java.util.Set;

import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions.Type;
import mx.infotec.dads.kukulkan.tables.handsontable.annotations.Sheet;
import mx.infotec.dads.kukulkan.tables.handsontable.annotations.SheetColumn;

/**
 * A DTO representing a user, with his authorities.
 */
@Sheet(minRows = 20, readOnly = true)
public class UserDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6215183916195869574L;

    @SheetColumn(title = "ID")
    private String id;

    @SheetColumn
    private String login;

    private String firstName;

    private String lastName;

    @SheetColumn
    private String email;

    private String imageUrl;

    @SheetColumn
    private boolean activated = false;

    @SheetColumn
    private String langKey;

    private String createdBy;

    @SheetColumn(type = Type.DATE)
    private String createdDate;

    @SheetColumn
    private String lastModifiedBy;

    @SheetColumn(type = Type.DATE)
    private String lastModifiedDate;

    @SheetColumn
    private Set<String> authorities;

    @SheetColumn
    private Genre genre;

    @SheetColumn(type = Type.TIME)
    private String lastLogin;

    @SheetColumn
    private Integer followers;

    public UserDTO() {
        // Empty constructor needed for MapStruct.
    }

    public UserDTO(String id, String login, String firstName, String lastName, String email, boolean activated,
            String imageUrl, String langKey, String createdBy, String createdDate, String lastModifiedBy,
            String lastModifiedDate, Set<String> authorities, Genre genre, String lastLogin, Integer followers) {

        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.imageUrl = imageUrl;
        this.langKey = langKey;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.authorities = authorities;
        this.genre = genre;
        this.lastLogin = lastLogin;
        this.followers = followers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isActivated() {
        return activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    enum Genre {
        MALE, FEMALE
    }

    @Override
    public String toString() {
        return "UserDTO{" + "login='" + login + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
                + '\'' + ", email='" + email + '\'' + ", imageUrl='" + imageUrl + '\'' + ", activated=" + activated
                + ", langKey='" + langKey + '\'' + ", createdBy=" + createdBy + ", createdDate=" + createdDate
                + ", lastModifiedBy='" + lastModifiedBy + '\'' + ", lastModifiedDate=" + lastModifiedDate
                + ", authorities=" + authorities + "}";
    }
}
