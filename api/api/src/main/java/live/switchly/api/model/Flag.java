package live.switchly.api.model;

import java.util.UUID;

public class Flag {

    private final UUID id;
    private final UUID organizationId;
    private final UUID projectId;
    private final String key;
    private final String name;
    private final String description;
    private boolean enabled;

    public Flag(UUID id, UUID organizationId, UUID projectId, String key, String name,String description, boolean enabled) {
        this.id = id;
        this.organizationId = organizationId;
        this.projectId = projectId;
        this.key = key;
        this.name = name;
        this.description = description;
        this.enabled = enabled;
    }

    public UUID getId() { return id; }
    public UUID getOrganizationId() { return organizationId; }
    public UUID getProjectId() { return projectId; }
    public String getKey() { return key; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isEnabled() { return enabled; }

    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}

//PS C:\Users\lenovo\Downloads\switchly> Invoke-RestMethod -Uri "http://localhost:8080/api/v1/projects/$projectId/flags" `
//>>   -Method Post `
//>>   -ContentType "application/json" `
//>>   -Body $body
//
//
//id             : 1f07513d-cc80-433e-9bbd-704a876b1fbf
//organizationId : c82aee8f-8555-4e4c-bd84-0de26ff4eb75
//projectId      : df28164c-e23c-43c2-8c89-7a91698f57fe
//key            : file-audit-flag-final
//name           : File Audit Flag Final
//description    : Touched Files:
//
//                 - model/Flag.java
//
//                 - dto/CreateFlagRequest.java
//
//                 - service/FlagService.java
//
//                 - controller/FlagController.java
//
//
//
//                 Not Touched Files:
//
//                 - SwitchlyApiApplication.java
//
//                 - controller/OrganizationController.java
//
//                 - controller/ProjectController.java
//
//                 - dto/CreateOrganizationRequest.java
//
//                 - dto/CreateProjectRequest.java
//
//                 - dto/UpdateFlagStateRequest.java
//
//                 - exception/* (All exception classes)
//
//                 - model/Organization.java
//
//                 - model/Project.java
//
//                 - repository/* (All repositories)
//
//                 - service/OrganizationService.java
//
//                 - service/ProjectService.java
//
//enabled        : False
