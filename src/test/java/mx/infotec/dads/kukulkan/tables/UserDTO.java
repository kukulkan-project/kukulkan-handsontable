package mx.infotec.dads.kukulkan.tables;

import java.util.Set;

import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions.Type;
import mx.infotec.dads.kukulkan.tables.handsontable.annotations.Sheet;
import mx.infotec.dads.kukulkan.tables.handsontable.annotations.SheetColumn;

/**
 * A DTO representing a user, with his authorities.
 */
@Sheet(minRows = 20)
public class UserDTO {

    @SheetColumn(type = Type.TEXT, title = "ID")
    private String id;

    @SheetColumn(type = Type.TEXT, title = "Login")
    private String login;

    private String firstName;

    private String lastName;

    @SheetColumn(type = Type.TEXT, title = "Email")
    private String email;

    private String imageUrl;

    @SheetColumn(type = Type.CHECKBOX, title = "Active")
    private boolean activated = false;

    @SheetColumn(type = Type.TEXT, title = "Language")
    private String langKey;

    private String createdBy;

    @SheetColumn(type = Type.DATE, title = "Created date")
    private String createdDate;

    @SheetColumn(type = Type.TEXT, title = "Modified by")
    private String lastModifiedBy;

    @SheetColumn(type = Type.DATE, title = "Modified date")
    private String lastModifiedDate;

    @SheetColumn(type = Type.TEXT, title = "Profiles")
    private Set<String> authorities;

    public UserDTO() {
        // Empty constructor needed for MapStruct.
    }

    public UserDTO(String id, String login, String firstName, String lastName, String email, boolean activated,
            String imageUrl, String langKey, String createdBy, String createdDate, String lastModifiedBy,
            String lastModifiedDate, Set<String> authorities) {

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

    @Override
    public String toString() {
        return "UserDTO{" + "login='" + login + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
                + '\'' + ", email='" + email + '\'' + ", imageUrl='" + imageUrl + '\'' + ", activated=" + activated
                + ", langKey='" + langKey + '\'' + ", createdBy=" + createdBy + ", createdDate=" + createdDate
                + ", lastModifiedBy='" + lastModifiedBy + '\'' + ", lastModifiedDate=" + lastModifiedDate
                + ", authorities=" + authorities + "}";
    }
}
