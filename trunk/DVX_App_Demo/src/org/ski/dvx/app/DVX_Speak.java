package org.ski.dvx.app;


import javax.speech.Central;
//import javax.speech.synthesis.SpeakableListener;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.SynthesizerProperties;
import javax.speech.synthesis.Voice;

import com.cloudgarden.speech.userinterface.Mouth;

public class DVX_Speak {
    SynthesizerModeDesc desc = null;
	Synthesizer synth = null;

	float speakingRate = 160.0f;
	float volume = 1.0f;

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public float getSpeakingRate() {
		return speakingRate;
	}

	public void setSpeakingRate(float speakingRate) {
		this.speakingRate = speakingRate;
	}

	
	DVX_Speak()
	{
		try
		{
		synth = Central.createSynthesizer(desc);
		}
		catch (Exception ex)
		{
			System.err.println("Exception createSynthesizer = " + ex);
		}
	}
	
	public void speak (String message) {
		try {
		    
		    SynthesizerModeDesc desc = null;
	/*	    SpeechEngineChooser chooser = null;
		    try {
			chooser = SpeechEngineChooser.getSynthesizerDialog();
			chooser.show();
			desc = chooser.getSynthesizerModeDesc();
		    } catch(NoClassDefFoundError e) {
			System.out.println("Can't find Swing - try using Java 2 to see the SpeechEngineChooser");
		    } */
		    synth = Central.createSynthesizer(desc);
		    ((com.cloudgarden.speech.CGEngineProperties)
		    synth.getSynthesizerProperties()).setEventsInNewThread(false);
//		    synth.addEngineListener(new TestEngineListener());
	        Mouth spList = new Mouth();
		    //synth.addSpeakableListener(spList);
		    
		    synth.allocate();
		    synth.resume();
		    synth.waitEngineState(Synthesizer.ALLOCATED);
		    
		    Voice v = null;
//		    if(chooser != null) v = chooser.getVoice();
		    //Get a female voice if the chooser was not created or no voice was selected
		    if(v == null) new Voice(null,Voice.GENDER_FEMALE, Voice.AGE_DONT_CARE, null);
		    
		    System.out.println("Using voice "+v);
		    SynthesizerProperties props = synth.getSynthesizerProperties();
		    props.setVoice(v);
		    props.setVolume(volume);
//		    System.out.println("Speaking at volume = " + volume);
		    props.setSpeakingRate(speakingRate);
		    
		    
//		    synth.speak("",null);
//		    synth.waitEngineState(synth.QUEUE_EMPTY);
		    synth.speak(message ,spList);
//		    synth.waitEngineState(synth.QUEUE_EMPTY);
	
		    
		} catch(Exception e) {
		    e.printStackTrace(System.out);
		} catch(Error e1) {
		    e1.printStackTrace(System.out);
		} finally {
		    try {
//			synth.deallocate();
//			synth.waitEngineState(synth.DEALLOCATED);
		    } catch(Exception e2) {}
//		    System.exit(0);
		}
	    }

}
