/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic1.gdx.assets.loaders;

import com.badlogic1.gdx.Gdx;
import com.badlogic1.gdx.assets.AssetDescriptor;
import com.badlogic1.gdx.assets.AssetLoaderParameters;
import com.badlogic1.gdx.assets.AssetManager;
import com.badlogic1.gdx.audio.Sound;
import com.badlogic1.gdx.utils.Array;

/** {@link AssetLoader} to load {@link Sound} instances.
 * @author mzechner */
public class SoundLoader extends SynchronousAssetLoader<Sound, SoundLoader.SoundParameter> {
	public SoundLoader (FileHandleResolver resolver) {
		super(resolver);
	}

	@Override
	public Sound load (AssetManager assetManager, String fileName, SoundParameter parameter) {
		return Gdx.audio.newSound(resolve(fileName));
	}

	@Override
	public Array<AssetDescriptor> getDependencies (String fileName, SoundParameter parameter) {
		return null;
	}

	static public class SoundParameter extends AssetLoaderParameters<Sound> {
	}
}
