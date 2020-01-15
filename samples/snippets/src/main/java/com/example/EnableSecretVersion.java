/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

// [START secretmanager_enable_secret_version]
import com.google.cloud.secretmanager.v1beta1.EnableSecretVersionRequest;
import com.google.cloud.secretmanager.v1beta1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1beta1.SecretVersion;
import com.google.cloud.secretmanager.v1beta1.SecretVersionName;
import java.io.IOException;

public class EnableSecretVersion {

  public void enableSecretVersion() throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "your-project-id";
    String secretId = "your-secret-id";
    String versionId = "your-version-id";
    enableSecretVersion(projectId, secretId, versionId);
  }

  // Enable an existing secret version.
  public void enableSecretVersion(String projectId, String secretId, String versionId)
      throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (SecretManagerServiceClient client = SecretManagerServiceClient.create()) {
      // Build the name from the version.
      SecretVersionName name = SecretVersionName.of(projectId, secretId, versionId);

      // Create the request.
      EnableSecretVersionRequest request =
          EnableSecretVersionRequest.newBuilder().setName(name.toString()).build();

      // Create the secret.
      SecretVersion version = client.enableSecretVersion(request);
      System.out.printf("Enabled secret version %s\n", version.getName());
    }
  }
}
// [END secretmanager_enable_secret_version]
