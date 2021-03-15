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

public class IdentityPropogation {

	@Autowired
	@Qualifier("maiRequest")
	private MAIRequest maiRequest;

	// PingOne-Identity Propagation : Plans : ReadAllPlans
	@GetMapping("/environments/{{envID}}/propagation/plans")
	public String getReadAllPlans() {
		return "ReadAllPlans";
	}

	// PingOne-Identity Propagation : Plans : CreatePlan
	@PostMapping("/environments/{{envID}}/propagation/plans")
	public String postCreatePlan() {
		return "CreatePlan";
	}

	// PingOne-Identity Propagation : Plans : UpdatePlanPut
	@PutMapping("/environments/{{envID}}/propagation/plans/{{planID}}")
	public String putUpdatePlanPut() {
		return "UpdatePlanPut";
	}

	// PingOne-Identity Propagation : Plans : DeletePlan
	@DeleteMapping("/environments/{{envID}}/propagation/plans/{{planID}}")
	public String deleteDeletePlan() {
		return "DeletePlan";
	}

	// PingOne-Identity Propagation : Stores : ReadAllStores
	@GetMapping("/environments/{{envID}}/propagation/stores")
	public String getReadAllStores() {
		return "ReadAllStores";
	}

	// PingOne-Identity Propagation : Stores : ReadOneStore
	@GetMapping("/environments/{{envID}}/propagation/stores/{{storeID}}")
	public String getReadOneStore() {
		return "ReadOneStore";
	}

	// PingOne-Identity Propagation : Stores : CreateStore
	@PostMapping("/environments/{{envID}}/propagation/stores")
	public String postCreateStore() {
		return "CreateStore";
	}

	// PingOne-Identity Propagation : Stores : TestConnectionConfiguration
	@PostMapping("{{osmosisPath}}/environments/{{envID}}/propagation/stores/connection/status")
	public String postTestConnectionConfiguration() {
		return "TestConnectionConfiguration";
	}

	// PingOne-Identity Propagation : Stores : UpdateStorePut
	@PutMapping("/environments/{{envID}}/propagation/stores/{{storeID}}")
	public String putUpdateStorePut() {
		return "UpdateStorePut";
	}

	// PingOne-Identity Propagation : Stores : DeleteStore
	@DeleteMapping("/environments/{{envID}}/propagation/stores/{{storeID}}")
	public String deleteDeleteStore() {
		return "DeleteStore";
	}

	// PingOne-Identity Propagation : StoreMetadata :
	// IdentityPropagationStoreMetadataScim
	@PostMapping("/environments/{{envID}}/propagation/storemetadata/scim")
	public String postIdentityPropagationStoreMetadataScim() {
		return "IdentityPropagationStoreMetadataScim";
	}

	// PingOne-Identity Propagation : StoreMetadata :
	// IdentityPropagationStoreMetadataSalesforce
	@PostMapping("/environments/{{envID}}/propagation/storemetadata/Salesforce")
	public String postIdentityPropagationStoreMetadataSalesforce() {
		return "IdentityPropagationStoreMetadataSalesforce";
	}

	// PingOne-Identity Propagation : Rules : ReadAllRules
	@GetMapping("/environments/{{envID}}/propagation/rules")
	public String getReadAllRules() {
		return "ReadAllRules";
	}

	// PingOne-Identity Propagation : Rules : ReadOnePlan'SRules
	@GetMapping("/environments/{{envID}}/propagation/plans/{{planID}}/rules")
	public String getReadOnePlansRules() {
		return "ReadOnePlan'sRules";
	}

	// PingOne-Identity Propagation : Rules : ReadOneRule
	@GetMapping("/environments/{{envID}}/propagation/rules/{{ruleID}}")
	public String getReadOneRule() {
		return "ReadOneRule";
	}

	// PingOne-Identity Propagation : Rules : CreateRule
	@PostMapping("/environments/{{envID}}/propagation/rules")
	public String postCreateRule() {
		return "CreateRule";
	}

	// PingOne-Identity Propagation : Rules : UpdateRule
	@PutMapping("/environments/{{envID}}/propagation/rules/{{ruleID}}")
	public String putUpdateRule() {
		return "UpdateRule";
	}

	// PingOne-Identity Propagation : Rules : DeleteRule
	@DeleteMapping("/environments/{{envID}}/propagation/rules/{{ruleID}}")
	public String deleteDeleteRule() {
		return "DeleteRule";
	}

	// PingOne-Identity Propagation : Mappings : ReadOneRuleMappings
	@GetMapping("/environments/{{envID}}/propagation/rules/{{ruleID}}/mappings")
	public String getReadOneRuleMappings() {
		return "ReadOneRuleMappings";
	}

	// PingOne-Identity Propagation : Mappings : ReadOneMapping
	@GetMapping("/environments/{{envID}}/propagation/mappings/{{mappingID}}")
	public String getReadOneMapping() {
		return "ReadOneMapping";
	}

	// PingOne-Identity Propagation : Mappings : CreateOneBasicMapping
	@PostMapping("/environments/{{envID}}/propagation/rules/{{ruleID}}/mappings")
	public String postCreateOneBasicMapping() {
		return "CreateOneBasicMapping";
	}

	// PingOne-Identity Propagation : Mappings : UpdateMappingPut
	@PutMapping("/environments/{{envID}}/propagation/mappings/{{mappingID}}")
	public String putUpdateMappingPut() {
		return "UpdateMappingPut";
	}

	// PingOne-Identity Propagation : Mappings : DeleteMapping
	@DeleteMapping("/environments/{{envID}}/propagation/mapping/{{mappingID}}")
	public String deleteDeleteMapping() {
		return "DeleteMapping";
	}

	// PingOne-Identity Propagation : Revisions : ReadLatestRevision
	@GetMapping("/environments/{{envID}}/propagation/revisions/id:latest")
	public String getReadLatestRevision() {
		return "ReadLatestRevision";
	}

	// PingOne-Identity Propagation : Revisions : ReadOneRevision
	@GetMapping("/environments/{{envID}}/propagation/revisions/{{revisionID}}")
	public String getReadOneRevision() {
		return "ReadOneRevision";
	}

	// PingOne-Identity Propagation : Revisions : CreateRevision
	@PostMapping("/environments/{{envID}}/propagation/revisions")
	public String postCreateRevision() {
		return "CreateRevision";
	}

	// PingOne-Identity Provider Management : IdentityProviders :
	// CreateIdentityProviderFacebook
	@PostMapping("/environments/{{envID}}/identityProviders")
	public String postCreateIdentityProviderFacebook() {
		return "CreateIdentityProviderFacebook";
	}

}
