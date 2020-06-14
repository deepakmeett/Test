
package com.example.test.Whole_data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
public class Whole {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Whole withMessage(String message) {
        this.message = message;
        return this;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Whole withData(Data data) {
        this.data = data;
        return this;
    }

    public class Data {

        @SerializedName("user")
        @Expose
        private User user;
        @SerializedName("token")
        @Expose
        private String token;

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Data withUser(User user) {
            this.user = user;
            return this;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public Data withToken(String token) {
            this.token = token;
            return this;
        }

        public class User {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("username")
            @Expose
            private String username;
            @SerializedName("first_name")
            @Expose
            private String firstName;
            @SerializedName("last_name")
            @Expose
            private String lastName;
            @SerializedName("manager")
            @Expose
            private String manager;
            @SerializedName("profile_pic")
            @Expose
            private String profilePic;
            @SerializedName("mobile")
            @Expose
            private String mobile;
            @SerializedName("designation")
            @Expose
            private String designation;
            @SerializedName("access_level")
            @Expose
            private Object accessLevel;
            @SerializedName("email_verified")
            @Expose
            private Boolean emailVerified;
            @SerializedName("is_first_login")
            @Expose
            private Boolean isFirstLogin;
            @SerializedName("status")
            @Expose
            private Integer status;
            @SerializedName("created_at")
            @Expose
            private String createdAt;
            @SerializedName("updated_at")
            @Expose
            private String updatedAt;
            @SerializedName("created_by")
            @Expose
            private Object createdBy;
            @SerializedName("modified_by")
            @Expose
            private Integer modifiedBy;
            @SerializedName("role_id")
            @Expose
            private Integer roleId;
            @SerializedName("company_role_users")
            @Expose
            private List<CompanyRoleUser> companyRoleUsers = null;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public User withId(Integer id) {
                this.id = id;
                return this;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public User withUsername(String username) {
                this.username = username;
                return this;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public User withFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public User withLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public String getManager() {
                return manager;
            }

            public void setManager(String manager) {
                this.manager = manager;
            }

            public User withManager(String manager) {
                this.manager = manager;
                return this;
            }

            public String getProfilePic() {
                return profilePic;
            }

            public void setProfilePic(String profilePic) {
                this.profilePic = profilePic;
            }

            public User withProfilePic(String profilePic) {
                this.profilePic = profilePic;
                return this;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public User withMobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            public String getDesignation() {
                return designation;
            }

            public void setDesignation(String designation) {
                this.designation = designation;
            }

            public User withDesignation(String designation) {
                this.designation = designation;
                return this;
            }

            public Object getAccessLevel() {
                return accessLevel;
            }

            public void setAccessLevel(Object accessLevel) {
                this.accessLevel = accessLevel;
            }

            public User withAccessLevel(Object accessLevel) {
                this.accessLevel = accessLevel;
                return this;
            }

            public Boolean getEmailVerified() {
                return emailVerified;
            }

            public void setEmailVerified(Boolean emailVerified) {
                this.emailVerified = emailVerified;
            }

            public User withEmailVerified(Boolean emailVerified) {
                this.emailVerified = emailVerified;
                return this;
            }

            public Boolean getIsFirstLogin() {
                return isFirstLogin;
            }

            public void setIsFirstLogin(Boolean isFirstLogin) {
                this.isFirstLogin = isFirstLogin;
            }

            public User withIsFirstLogin(Boolean isFirstLogin) {
                this.isFirstLogin = isFirstLogin;
                return this;
            }

            public Integer getStatus() {
                return status;
            }

            public void setStatus(Integer status) {
                this.status = status;
            }

            public User withStatus(Integer status) {
                this.status = status;
                return this;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public User withCreatedAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public User withUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Object getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(Object createdBy) {
                this.createdBy = createdBy;
            }

            public User withCreatedBy(Object createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            public Integer getModifiedBy() {
                return modifiedBy;
            }

            public void setModifiedBy(Integer modifiedBy) {
                this.modifiedBy = modifiedBy;
            }

            public User withModifiedBy(Integer modifiedBy) {
                this.modifiedBy = modifiedBy;
                return this;
            }

            public Integer getRoleId() {
                return roleId;
            }

            public void setRoleId(Integer roleId) {
                this.roleId = roleId;
            }

            public User withRoleId(Integer roleId) {
                this.roleId = roleId;
                return this;
            }

            public List<CompanyRoleUser> getCompanyRoleUsers() {
                return companyRoleUsers;
            }

            public void setCompanyRoleUsers(List<CompanyRoleUser> companyRoleUsers) {
                this.companyRoleUsers = companyRoleUsers;
            }

            public User withCompanyRoleUsers(List<CompanyRoleUser> companyRoleUsers) {
                this.companyRoleUsers = companyRoleUsers;
                return this;
            }

            public class CompanyRoleUser {

                @SerializedName("id")
                @Expose
                private Integer id;
                @SerializedName("company")
                @Expose
                private Company company;
                @SerializedName("company_role")
                @Expose
                private CompanyRole companyRole;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public CompanyRoleUser withId(Integer id) {
                    this.id = id;
                    return this;
                }

                public Company getCompany() {
                    return company;
                }

                public void setCompany(Company company) {
                    this.company = company;
                }

                public CompanyRoleUser withCompany(Company company) {
                    this.company = company;
                    return this;
                }

                public CompanyRole getCompanyRole() {
                    return companyRole;
                }

                public void setCompanyRole(CompanyRole companyRole) {
                    this.companyRole = companyRole;
                }

                public CompanyRoleUser withCompanyRole(CompanyRole companyRole) {
                    this.companyRole = companyRole;
                    return this;
                }
                public class Company {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("company_id")
                    @Expose
                    private long companyId;
                    @SerializedName("company_initial")
                    @Expose
                    private Object companyInitial;
                    @SerializedName("type")
                    @Expose
                    private String type;
                    @SerializedName("industry")
                    @Expose
                    private Integer industry;
                    @SerializedName("no_of_employee")
                    @Expose
                    private Integer noOfEmployee;
                    @SerializedName("status")
                    @Expose
                    private Integer status;
                    @SerializedName("profile_pic")
                    @Expose
                    private Object profilePic;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public Company withId(Integer id) {
                        this.id = id;
                        return this;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Company withName(String name) {
                        this.name = name;
                        return this;
                    }

                    public long getCompanyId() {
                        return companyId;
                    }

                    public void setCompanyId(long companyId) {
                        this.companyId = companyId;
                    }

                    public Company withCompanyId(Integer companyId) {
                        this.companyId = companyId;
                        return this;
                    }

                    public Object getCompanyInitial() {
                        return companyInitial;
                    }

                    public void setCompanyInitial(Object companyInitial) {
                        this.companyInitial = companyInitial;
                    }

                    public Company withCompanyInitial(Object companyInitial) {
                        this.companyInitial = companyInitial;
                        return this;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public Company withType(String type) {
                        this.type = type;
                        return this;
                    }

                    public Integer getIndustry() {
                        return industry;
                    }

                    public void setIndustry(Integer industry) {
                        this.industry = industry;
                    }

                    public Company withIndustry(Integer industry) {
                        this.industry = industry;
                        return this;
                    }

                    public Integer getNoOfEmployee() {
                        return noOfEmployee;
                    }

                    public void setNoOfEmployee(Integer noOfEmployee) {
                        this.noOfEmployee = noOfEmployee;
                    }

                    public Company withNoOfEmployee(Integer noOfEmployee) {
                        this.noOfEmployee = noOfEmployee;
                        return this;
                    }

                    public Integer getStatus() {
                        return status;
                    }

                    public void setStatus(Integer status) {
                        this.status = status;
                    }

                    public Company withStatus(Integer status) {
                        this.status = status;
                        return this;
                    }

                    public Object getProfilePic() {
                        return profilePic;
                    }

                    public void setProfilePic(Object profilePic) {
                        this.profilePic = profilePic;
                    }

                    public Company withProfilePic(Object profilePic) {
                        this.profilePic = profilePic;
                        return this;
                    }

                }
                public class CompanyRole {

                    @SerializedName("id")
                    @Expose
                    private Integer id;
                    @SerializedName("name")
                    @Expose
                    private String name;
                    @SerializedName("description")
                    @Expose
                    private String description;
                    @SerializedName("status")
                    @Expose
                    private Integer status;
                    @SerializedName("company_access")
                    @Expose
                    private Integer companyAccess;
                    @SerializedName("profile_access")
                    @Expose
                    private Integer profileAccess;
                    @SerializedName("role_access")
                    @Expose
                    private Integer roleAccess;
                    @SerializedName("user_access")
                    @Expose
                    private Integer userAccess;
                    @SerializedName("structure_access")
                    @Expose
                    private Integer structureAccess;
                    @SerializedName("personal_profile_access")
                    @Expose
                    private Integer personalProfileAccess;
                    @SerializedName("contest_access")
                    @Expose
                    private Integer contestAccess;
                    @SerializedName("created_at")
                    @Expose
                    private String createdAt;
                    @SerializedName("updated_at")
                    @Expose
                    private String updatedAt;
                    @SerializedName("created_by")
                    @Expose
                    private Integer createdBy;
                    @SerializedName("modified_by")
                    @Expose
                    private Object modifiedBy;
                    @SerializedName("isDeleted")
                    @Expose
                    private Boolean isDeleted;
                    @SerializedName("company_id")
                    @Expose
                    private Integer companyId;

                    public Integer getId() {
                        return id;
                    }

                    public void setId(Integer id) {
                        this.id = id;
                    }

                    public CompanyRole withId(Integer id) {
                        this.id = id;
                        return this;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public CompanyRole withName(String name) {
                        this.name = name;
                        return this;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public CompanyRole withDescription(String description) {
                        this.description = description;
                        return this;
                    }

                    public Integer getStatus() {
                        return status;
                    }

                    public void setStatus(Integer status) {
                        this.status = status;
                    }

                    public CompanyRole withStatus(Integer status) {
                        this.status = status;
                        return this;
                    }

                    public Integer getCompanyAccess() {
                        return companyAccess;
                    }

                    public void setCompanyAccess(Integer companyAccess) {
                        this.companyAccess = companyAccess;
                    }

                    public CompanyRole withCompanyAccess(Integer companyAccess) {
                        this.companyAccess = companyAccess;
                        return this;
                    }

                    public Integer getProfileAccess() {
                        return profileAccess;
                    }

                    public void setProfileAccess(Integer profileAccess) {
                        this.profileAccess = profileAccess;
                    }

                    public CompanyRole withProfileAccess(Integer profileAccess) {
                        this.profileAccess = profileAccess;
                        return this;
                    }

                    public Integer getRoleAccess() {
                        return roleAccess;
                    }

                    public void setRoleAccess(Integer roleAccess) {
                        this.roleAccess = roleAccess;
                    }

                    public CompanyRole withRoleAccess(Integer roleAccess) {
                        this.roleAccess = roleAccess;
                        return this;
                    }

                    public Integer getUserAccess() {
                        return userAccess;
                    }

                    public void setUserAccess(Integer userAccess) {
                        this.userAccess = userAccess;
                    }

                    public CompanyRole withUserAccess(Integer userAccess) {
                        this.userAccess = userAccess;
                        return this;
                    }

                    public Integer getStructureAccess() {
                        return structureAccess;
                    }

                    public void setStructureAccess(Integer structureAccess) {
                        this.structureAccess = structureAccess;
                    }

                    public CompanyRole withStructureAccess(Integer structureAccess) {
                        this.structureAccess = structureAccess;
                        return this;
                    }

                    public Integer getPersonalProfileAccess() {
                        return personalProfileAccess;
                    }

                    public void setPersonalProfileAccess(Integer personalProfileAccess) {
                        this.personalProfileAccess = personalProfileAccess;
                    }

                    public CompanyRole withPersonalProfileAccess(Integer personalProfileAccess) {
                        this.personalProfileAccess = personalProfileAccess;
                        return this;
                    }

                    public Integer getContestAccess() {
                        return contestAccess;
                    }

                    public void setContestAccess(Integer contestAccess) {
                        this.contestAccess = contestAccess;
                    }

                    public CompanyRole withContestAccess(Integer contestAccess) {
                        this.contestAccess = contestAccess;
                        return this;
                    }

                    public String getCreatedAt() {
                        return createdAt;
                    }

                    public void setCreatedAt(String createdAt) {
                        this.createdAt = createdAt;
                    }

                    public CompanyRole withCreatedAt(String createdAt) {
                        this.createdAt = createdAt;
                        return this;
                    }

                    public String getUpdatedAt() {
                        return updatedAt;
                    }

                    public void setUpdatedAt(String updatedAt) {
                        this.updatedAt = updatedAt;
                    }

                    public CompanyRole withUpdatedAt(String updatedAt) {
                        this.updatedAt = updatedAt;
                        return this;
                    }

                    public Integer getCreatedBy() {
                        return createdBy;
                    }

                    public void setCreatedBy(Integer createdBy) {
                        this.createdBy = createdBy;
                    }

                    public CompanyRole withCreatedBy(Integer createdBy) {
                        this.createdBy = createdBy;
                        return this;
                    }

                    public Object getModifiedBy() {
                        return modifiedBy;
                    }

                    public void setModifiedBy(Object modifiedBy) {
                        this.modifiedBy = modifiedBy;
                    }

                    public CompanyRole withModifiedBy(Object modifiedBy) {
                        this.modifiedBy = modifiedBy;
                        return this;
                    }

                    public Boolean getIsDeleted() {
                        return isDeleted;
                    }

                    public void setIsDeleted(Boolean isDeleted) {
                        this.isDeleted = isDeleted;
                    }

                    public CompanyRole withIsDeleted(Boolean isDeleted) {
                        this.isDeleted = isDeleted;
                        return this;
                    }

                    public Integer getCompanyId() {
                        return companyId;
                    }

                    public void setCompanyId(Integer companyId) {
                        this.companyId = companyId;
                    }

                    public CompanyRole withCompanyId(Integer companyId) {
                        this.companyId = companyId;
                        return this;
                    }
                }
            }
        }
    }
}
