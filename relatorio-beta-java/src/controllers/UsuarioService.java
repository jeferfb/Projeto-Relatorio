package controllers;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

@Service("UsuarioService")
@RemotingDestination(channels={"my-amf"})
public class UsuarioService {

}
