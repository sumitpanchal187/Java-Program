import pandas as pd
import numpy as np
from sklearn.cluster import KMeans
from sklearn.preprocessing import StandardScaler
from sklearn.feature_extraction.text import HashingVectorizer
import matplotlib.pyplot as plt

# Load the CSV dataset
dataset_path = "2020-11-27-some-ZLoader-IOCs.csv"
data = pd.read_csv(dataset_path)

# Select relevant columns/features (adjust as needed)
selected_features = ['Attachment SHA256 hash', 'Extracted XLS SHA256 hash', 'URL from macro', 'Downloaded DLL SHA256 hash' , 
                     'HTTPS C2 traffic from DLL']
data_selected = data[selected_features]

# Handle missing values if necessary (fill with zeros for demonstration)
data_selected = data_selected.fillna('0')

# Convert string features to numerical representations using HashingVectorizer
vectorizer = HashingVectorizer(n_features=1000, alternate_sign=False)
X = vectorizer.transform(data_selected.values.flatten()).toarray()

# Scale the features
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)

# Apply K-means clustering
n_clusters = 3  # Number of clusters you want
kmeans = KMeans(n_clusters=n_clusters, random_state=42)
kmeans.fit(X_scaled)

# Visualize the clusters (use the appropriate features for visualization)
plt.scatter(X_scaled[:, 0], X_scaled[:, 1], c=kmeans.labels_, cmap='viridis')
plt.scatter(kmeans.cluster_centers_[:, 0], kmeans.cluster_centers_[:, 1], marker='x', color='red', s=100)
plt.xlabel('Feature 1')
plt.ylabel('Feature 2')
plt.title('K-means Clustering')
print("Name : Sumit Panchal\nEnrolment No :20C22024") 
plt.show()
