package com.ril.deliveryapp.data.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by emb-kimilap on 19/4/17.
 */

public class LoginResponse {

    @Expose
    @SerializedName("UserType")
    private String UserType;

    @Expose
    @SerializedName("LoginID")
    private String LoginID;

    @Expose
    @SerializedName("BillingAddress_Key")
    private String BillingAddress_Key;

    @Expose
    @SerializedName("Password")
    private String Password;

    @Expose
    @SerializedName("UserGroupID")
    private String UserGroupID;

    @Expose
    @SerializedName("UserToken")
    private String UserToken;
    private String UserName;
    private String Business_Key;

    private String LongDesc;

    private String UserGroup_Description;

    private String OrganizationCode;

    private String User_key;

    private String UserGroup_Name;

    private String ContactAddress_Key;

    private String UserGroup_Key;

    private String Preference_Key;

    private String ImageFile;

    private String LocaleCode;

    private String Note_Key;

    private String PWDLastChangedOn;

    private String ActivateFlag;

    public String getNodeType() {
        return NodeType;
    }

    public void setNodeType(String nodeType) {
        NodeType = nodeType;
    }

    private String NodeType;


    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public String getLoginID() {
        return LoginID;
    }

    public void setLoginID(String loginID) {
        LoginID = loginID;
    }

    public String getBillingAddress_Key() {
        return BillingAddress_Key;
    }

    public void setBillingAddress_Key(String billingAddress_Key) {
        BillingAddress_Key = billingAddress_Key;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserGroupID() {
        return UserGroupID;
    }

    public void setUserGroupID(String userGroupID) {
        UserGroupID = userGroupID;
    }

    public String getUserToken() {
        return UserToken;
    }

    public void setUserToken(String userToken) {
        UserToken = userToken;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getBusiness_Key() {
        return Business_Key;
    }

    public void setBusiness_Key(String business_Key) {
        Business_Key = business_Key;
    }

    public String getLongDesc() {
        return LongDesc;
    }

    public void setLongDesc(String longDesc) {
        LongDesc = longDesc;
    }

    public String getUserGroup_Description() {
        return UserGroup_Description;
    }

    public void setUserGroup_Description(String userGroup_Description) {
        UserGroup_Description = userGroup_Description;
    }

    public String getOrganizationCode() {
        return OrganizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        OrganizationCode = organizationCode;
    }

    public String getUser_key() {
        return User_key;
    }

    public void setUser_key(String user_key) {
        User_key = user_key;
    }

    public String getUserGroup_Name() {
        return UserGroup_Name;
    }

    public void setUserGroup_Name(String userGroup_Name) {
        UserGroup_Name = userGroup_Name;
    }

    public String getContactAddress_Key() {
        return ContactAddress_Key;
    }

    public void setContactAddress_Key(String contactAddress_Key) {
        ContactAddress_Key = contactAddress_Key;
    }

    public String getUserGroup_Key() {
        return UserGroup_Key;
    }

    public void setUserGroup_Key(String userGroup_Key) {
        UserGroup_Key = userGroup_Key;
    }

    public String getPreference_Key() {
        return Preference_Key;
    }

    public void setPreference_Key(String preference_Key) {
        Preference_Key = preference_Key;
    }

    public String getImageFile() {
        return ImageFile;
    }

    public void setImageFile(String imageFile) {
        ImageFile = imageFile;
    }

    public String getLocaleCode() {
        return LocaleCode;
    }

    public void setLocaleCode(String localeCode) {
        LocaleCode = localeCode;
    }

    public String getNote_Key() {
        return Note_Key;
    }

    public void setNote_Key(String note_Key) {
        Note_Key = note_Key;
    }

    public String getPWDLastChangedOn() {
        return PWDLastChangedOn;
    }

    public void setPWDLastChangedOn(String PWDLastChangedOn) {
        this.PWDLastChangedOn = PWDLastChangedOn;
    }

    public String getActivateFlag() {
        return ActivateFlag;
    }

    public void setActivateFlag(String activateFlag) {
        ActivateFlag = activateFlag;
    }


}
