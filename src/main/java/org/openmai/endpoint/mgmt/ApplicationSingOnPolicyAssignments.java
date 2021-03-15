package org.openmai.endpoint.mgmt;
import org.openmai.beans.MAIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class ApplicationSingOnPolicyAssignments {
	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Applications : ApplicationSign-OnPolicyAssignments : CreateSopAssignment
	@PostMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/signOnPolicyAssignments")
	  public String postCreateSopAssignment(){return "CreateSopAssignment";}
	// PingOne-Applications : ApplicationSign-OnPolicyAssignments : ReadAllSopAssignments
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/signOnPolicyAssignments")
	  public String getReadAllSopAssignments(){return "ReadAllSopAssignments";}
	// PingOne-Applications : ApplicationSign-OnPolicyAssignments : ReadOneSopAssignment
	@GetMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/signOnPolicyAssignments/{{SOPAssignmentID}}")
	  public String getReadOneSopAssignment(){return "ReadOneSopAssignment";}
	// PingOne-Applications : ApplicationSign-OnPolicyAssignments : UpdateSopAssignment
	@PutMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/signOnPolicyAssignments/{{SOPAssignmentID}}")
	  public String putUpdateSopAssignment(){return "UpdateSopAssignment";}
	// PingOne-Applications : ApplicationSign-OnPolicyAssignments : DeleteSopAssignment
	@DeleteMapping("{{apiPath}}/environments/{{envID}}/applications/{{appID}}/signOnPolicyAssignments/{{SOPAssignmentID}}")
	  public String deleteDeleteSopAssignment(){return "DeleteSopAssignment";}

}
