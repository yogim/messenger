package com.ymhase.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ymhase.rest.messenger.model.Profile;
import com.ymhase.rest.messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

    private ProfileService profileService = new ProfileService();

    @GET
    public List<Profile> getProfile() {

	return profileService.getProfiles();
    }
    
    
    @POST
    public List<Profile> addProfile(Profile profile){
	profileService.addProfile(profile);
	return profileService.getProfiles();
	
    }

}
