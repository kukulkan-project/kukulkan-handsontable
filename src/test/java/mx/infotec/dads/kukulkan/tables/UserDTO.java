package mx.infotec.dads.kukulkan.tables;

import java.time.ZonedDateTime;
import java.util.Set;

import mx.infotec.dads.kukulkan.tables.handsontable.annotations.SheetColumn;

/**
 * A DTO representing a user, with his authorities.
 */
public class UserDTO {

    @SheetColumn(type = "numeric", title = "ID")
    private String id;

    @SheetColumn(type = "text", title = "Login")
    private String login;

    private String firstName;

    private String lastName;

    @SheetColumn(type = "text", title = "Email")
    private String email;

    private String imageUrl;

    @SheetColumn(type = "checkbox", title = "Active")
    private boolean activated = false;

    @SheetColumn(type = "text", title = "Language")
    private String langKey;

    private String createdBy;

    @SheetColumn(type = "text", title = "Created date")
    private ZonedDateTime createdDate;

    @SheetColumn(type = "text", title = "Modified by")
    private String lastModifiedBy;

    @SheetColumn(type = "text", title = "Modified date")
    private ZonedDateTime lastModifiedDate;

    private Set<String> authorities;

    public UserDTO() {
        // Empty constructor needed for MapStruct.
    }

    public UserDTO(String id, String login, String firstName, String lastName, String email, boolean activated,
            String imageUrl, String langKey, String createdBy, ZonedDateTime createdDate, String lastModifiedBy,
            ZonedDateTime lastModifiedDate, Set<String> authorities) {

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

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public ZonedDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(ZonedDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Set<String> getAuthorities() {
        return authorities;
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
