#!/bin/sh

# Exit immediately if a command exits with a non-zero status
set -e

# Continuously check if the web service is up
until curl -s http://localhost:8080/; do
  >&2 echo "Web service is unavailable - sleeping"
  sleep 1
done

>&2 echo "Webservice is up - continuing"
