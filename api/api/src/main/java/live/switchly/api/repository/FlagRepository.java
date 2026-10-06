package live.switchly.api.repository;

import live.switchly.api.model.Flag;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FlagRepository {

    Flag save(Flag flag);

    Optional<Flag> findById(UUID id);

    List<Flag> findByProjectId(UUID projectId);

    boolean existsByProjectIdAndKey(UUID projectId, String key);

    boolean deleteById(UUID id);
}
//PS C:\Users\lenovo\Downloads\switchly> $flagId =$newFlag.id
//PS C:\Users\lenovo\Downloads\switchly> Write-Host "Created active Flag ID: $flagId"
//Created active Flag ID: 8f204404-48bf-41a8-baea-738f15c9f197
//PS C:\Users\lenovo\Downloads\switchly> Invoke-RestMethod -Uri "http://localhost:8080/api/v1/flags/$flagId" -Method Delete
//
//PS C:\Users\lenovo\Downloads\switchly> Write-Host "Successfully deleted flag (HTTP 204)."
//Successfully deleted flag (HTTP 204).
//PS C:\Users\lenovo\Downloads\switchly> Invoke-RestMethod -Uri "http://localhost:8080/api/v1/flags/$flagId" -Method Get
//Invoke-RestMethod : {"error":{"code":"NOT_FOUND","message":"Flag 8f204404-48bf-41a8-baea-738f15c9f197 not found"}}
//At line:1 char:1
//+ Invoke-RestMethod -Uri "http://localhost:8080/api/v1/flags/$flagId" - ...
//+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//    + CategoryInfo          : InvalidOperation: (System.Net.HttpWebRequest:HttpWebRequest) [Invoke-RestMethod], WebException
//    + FullyQualifiedErrorId : WebCmdletWebResponseException,Microsoft.PowerShell.Commands.InvokeRestMethodCommand
//PS C:\Users\lenovo\Downloads\switchly>