
package com.example.test.Data_list;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
public class Test {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<Data> data = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public class Data {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("source_id")
        @Expose
        private Integer sourceId;
        @SerializedName("destination_id")
        @Expose
        private Integer destinationId;
        @SerializedName("via_company")
        @Expose
        private Object viaCompany;
        @SerializedName("invited_by")
        @Expose
        private Integer invitedBy;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("approved_at")
        @Expose
        private String approvedAt;
        @SerializedName("approved_by")
        @Expose
        private Integer approvedBy;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("modified_by")
        @Expose
        private Integer modifiedBy;
        @SerializedName("isDeleted")
        @Expose
        private Boolean isDeleted;
        @SerializedName("source_tier_id")
        @Expose
        private Integer sourceTierId;
        @SerializedName("destination_tier_id")
        @Expose
        private Integer destinationTierId;
        @SerializedName("clusters_count")
        @Expose
        private Integer clustersCount;
        @SerializedName("sender")
        @Expose
        private Sender sender;
        @SerializedName("receiver")
        @Expose
        private Receiver receiver;
        @SerializedName("connected_via")
        @Expose
        private Object connectedVia;
        @SerializedName("creator")
        @Expose
        private Object creator;
        @SerializedName("source_tier")
        @Expose
        private SourceTier sourceTier;
        @SerializedName("destination_tier")
        @Expose
        private DestinationTier destinationTier;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getSourceId() {
            return sourceId;
        }

        public void setSourceId(Integer sourceId) {
            this.sourceId = sourceId;
        }

        public Integer getDestinationId() {
            return destinationId;
        }

        public void setDestinationId(Integer destinationId) {
            this.destinationId = destinationId;
        }

        public Object getViaCompany() {
            return viaCompany;
        }

        public void setViaCompany(Object viaCompany) {
            this.viaCompany = viaCompany;
        }

        public Integer getInvitedBy() {
            return invitedBy;
        }

        public void setInvitedBy(Integer invitedBy) {
            this.invitedBy = invitedBy;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getApprovedAt() {
            return approvedAt;
        }

        public void setApprovedAt(String approvedAt) {
            this.approvedAt = approvedAt;
        }

        public Integer getApprovedBy() {
            return approvedBy;
        }

        public void setApprovedBy(Integer approvedBy) {
            this.approvedBy = approvedBy;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Integer getModifiedBy() {
            return modifiedBy;
        }

        public void setModifiedBy(Integer modifiedBy) {
            this.modifiedBy = modifiedBy;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
        }

        public Integer getSourceTierId() {
            return sourceTierId;
        }

        public void setSourceTierId(Integer sourceTierId) {
            this.sourceTierId = sourceTierId;
        }

        public Integer getDestinationTierId() {
            return destinationTierId;
        }

        public void setDestinationTierId(Integer destinationTierId) {
            this.destinationTierId = destinationTierId;
        }

        public Integer getClustersCount() {
            return clustersCount;
        }

        public void setClustersCount(Integer clustersCount) {
            this.clustersCount = clustersCount;
        }

        public Sender getSender() {
            return sender;
        }

        public void setSender(Sender sender) {
            this.sender = sender;
        }

        public Receiver getReceiver() {
            return receiver;
        }

        public void setReceiver(Receiver receiver) {
            this.receiver = receiver;
        }

        public Object getConnectedVia() {
            return connectedVia;
        }

        public void setConnectedVia(Object connectedVia) {
            this.connectedVia = connectedVia;
        }

        public Object getCreator() {
            return creator;
        }

        public void setCreator(Object creator) {
            this.creator = creator;
        }

        public SourceTier getSourceTier() {
            return sourceTier;
        }

        public void setSourceTier(SourceTier sourceTier) {
            this.sourceTier = sourceTier;
        }

        public DestinationTier getDestinationTier() {
            return destinationTier;
        }

        public void setDestinationTier(DestinationTier destinationTier) {
            this.destinationTier = destinationTier;
        }

        public class Sender {

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
            @SerializedName("profile_pic")
            @Expose
            private Object profilePic;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getCompanyId() {
                return companyId;
            }

            public void setCompanyId(long companyId) {
                this.companyId = companyId;
            }

            public Object getCompanyInitial() {
                return companyInitial;
            }

            public void setCompanyInitial(Object companyInitial) {
                this.companyInitial = companyInitial;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Object getProfilePic() {
                return profilePic;
            }

            public void setProfilePic(Object profilePic) {
                this.profilePic = profilePic;
            }

        }

        public class Receiver {

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
            @SerializedName("profile_pic")
            @Expose
            private Object profilePic;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getCompanyId() {
                return companyId;
            }

            public void setCompanyId(long companyId) {
                this.companyId = companyId;
            }

            public Object getCompanyInitial() {
                return companyInitial;
            }

            public void setCompanyInitial(Object companyInitial) {
                this.companyInitial = companyInitial;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Object getProfilePic() {
                return profilePic;
            }

            public void setProfilePic(Object profilePic) {
                this.profilePic = profilePic;
            }

        }

        public class DestinationTier {

            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("type")
            @Expose
            private String type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

        }

        public class SourceTier {

            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("type")
            @Expose
            private String type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

        }

    }

}
